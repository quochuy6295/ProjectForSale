package projectmicroservice.projectforsale.repository.impl;

import jakarta.persistence.EntityManager;
import projectmicroservice.projectforsale.dto.DetailResponseDto;
import projectmicroservice.projectforsale.pagination.Page;
import projectmicroservice.projectforsale.pagination.PagingRepo;
import projectmicroservice.projectforsale.repository.UbiSupportRepository;
import projectmicroservice.projectforsale.repository.UbiSupportRepositoryCustom;

import java.util.HashMap;
import java.util.Map;

public class UbiSupportRepositoryCustomImpl implements UbiSupportRepositoryCustom {

    private final EntityManager em;

    public UbiSupportRepositoryCustomImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Page<DetailResponseDto> getDetail(String lang, String scope, String state, String type) {
        StringBuilder sqlCount = new StringBuilder(" SELECT COUNT(t1.ID) ");

        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT t1.ID id, t1.NAME name, \r\n"
                + " t1.LEVEL level, \r\n"
                + " t1.CREATE_TIME createTime \r\n"
                + "\r\n");

        StringBuilder sqlCondition = new StringBuilder();
        sqlCondition.append(" FROM ROLE t1\r\n"
                + " WHERE 1=1 ");
        Map paramMap = new HashMap();
//        SearchRoleSdi searchSdi = searchRolePagingSdi.getSearchRoleSdi();
//        if (!DataUtil.isNullObject(searchSdi.getName()) ) {
//            sqlCondition.append(" AND t1.NAME = :name");
//            paramMap.put("name", searchSdi.getName());
//        }
//
//        if (!DataUtil.isNullObject(searchSdi.getLevel())) {
//            sqlCondition.append(" AND t1.LEVEL = :level");
//            paramMap.put("level", searchSdi.getLevel());
//        }

        PagingRepo<DetailResponseDto> pageRepo = new PagingRepo<>(em, DetailResponseDto.class).withGet(sql.append(sqlCondition).append(" ORDER BY t1.ID DESC").toString()).withTotal(sqlCount.append(sqlCondition).toString());

        return pageRepo.query(page, paramMap);
    }
}
