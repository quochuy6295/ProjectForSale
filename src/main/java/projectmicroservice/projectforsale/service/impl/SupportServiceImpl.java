package projectmicroservice.projectforsale.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.dto.LnbResponseDto;
import projectmicroservice.projectforsale.pagination.Page;
import projectmicroservice.projectforsale.repository.UbiGlobalRepository;
import projectmicroservice.projectforsale.repository.UbiSupportRepository;
import projectmicroservice.projectforsale.service.SupportService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupportServiceImpl implements SupportService {

    @Autowired
    private UbiSupportRepository ubiSupportRepository;

    @Autowired
    private UbiGlobalRepository ubiGlobalRepository;

    @Override
    public Page<DetailResponseDto> getDetail(String lang, String scope, String state, String type) {
        return ubiSupportRepository.getDetail(lang, scope, state, type);
    }


//    @Override
//    public List<LnbResponseDto> getLnb(String lang, String scope, String state, String type) {
//        List<LnbResponseDto> lnbResponseDtos = new ArrayList<>();
//        lnbResponseDtos = ubiSupportRepository.findAllLnb(lang, scope, state, type);
//        return List.of();
//    }
}
