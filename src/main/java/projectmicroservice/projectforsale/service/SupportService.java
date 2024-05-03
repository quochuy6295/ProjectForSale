package projectmicroservice.projectforsale.service;

import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.dto.LnbResponseDto;
import projectmicroservice.projectforsale.pagination.Page;

import java.util.List;

public interface SupportService {

//    List<LnbResponseDto> getLnb(String lang, String scope, String state, String type);

    Page<DetailResponseDto> getDetail(String lang, String scope, String state, String type);
}
