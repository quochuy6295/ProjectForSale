package projectmicroservice.projectforsale.service;

import org.springframework.data.domain.Page;
import projectmicroservice.projectforsale.dto.ContentDto;
import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.dto.LnbResponseDto;

import java.util.List;

public interface SupportService {

    List<LnbResponseDto> getLnb(String lang, String scope, String state, String type);

    DetailResponseDto getDetail(String lang, String scope, String state, String type, Integer offset, Integer limit, String category);
}
