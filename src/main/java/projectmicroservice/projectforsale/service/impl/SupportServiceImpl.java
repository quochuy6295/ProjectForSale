package projectmicroservice.projectforsale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import projectmicroservice.projectforsale.dto.ContentDto;
import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.dto.LnbResponseDto;
import projectmicroservice.projectforsale.pagination.CustomPage;
import projectmicroservice.projectforsale.repository.UbiGlobalRepository;
import projectmicroservice.projectforsale.repository.UbiSupportRepository;
import projectmicroservice.projectforsale.service.SupportService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SupportServiceImpl implements SupportService {

    @Autowired
    private UbiSupportRepository ubiSupportRepository;

    @Autowired
    private UbiGlobalRepository ubiGlobalRepository;

    private final String totalString = "ALL";

    private final String totalCategory = "ALL";

    private final int seq = -1;

    @Override
    public List<LnbResponseDto> getLnb(String lang, String scope, String state, String type) {
        List<LnbResponseDto> lnbResponseDtos = new ArrayList<>();
        lnbResponseDtos = ubiSupportRepository.findAllLnb(lang, state, type);
        Long total = lnbResponseDtos.stream().mapToLong(LnbResponseDto::getSeq).sum();
        lnbResponseDtos.add(0, LnbResponseDto.builder().value(totalString).category(totalCategory).seq(seq).count(total).build());
        return lnbResponseDtos;
    }

    @Override
    public DetailResponseDto getDetail(String lang, String scope, String state, String type, Integer offset, Integer limit) {
        Pageable pageable = new CustomPage(offset, limit);
        Page<ContentDto> responseDto = ubiSupportRepository.getDetail(lang, scope, state, pageable);
        return DetailResponseDto.convertPage(responseDto);
    }
}
