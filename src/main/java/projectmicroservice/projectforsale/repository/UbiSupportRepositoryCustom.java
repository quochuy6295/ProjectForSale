package projectmicroservice.projectforsale.repository;

import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.pagination.Page;

public interface UbiSupportRepositoryCustom {

    Page<DetailResponseDto> getDetail(String lang, String scope, String state, String type);
}
