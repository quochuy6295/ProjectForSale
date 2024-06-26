//package projectmicroservice.projectforsale.pagination;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.Query;
//import jakarta.persistence.Tuple;
//import org.springframework.data.domain.Page;
//
//import java.lang.reflect.Field;
//import java.math.BigInteger;
//import java.util.List;
//import java.util.Map;
//
//public class PagingRepo<T> {
//    private final EntityManager em;
//    private final Class<T> genericClass;
//    private String totalSql;
//    private String getSql;
//
//    public PagingRepo(EntityManager em, Class<T> genericClass) {
//        this.em = em;
//        this.genericClass = genericClass;
//    }
//
//    public PagingRepo<T> with(String totalSql, String getSql) {
//        this.totalSql = totalSql;
//        this.getSql = getSql;
//        return this;
//    }
//
//    public PagingRepo<T> withTotal(String totalSql) {
//        this.totalSql = totalSql;
//        return this;
//    }
//
//    public PagingRepo<T> withGet(String getSql) {
//        this.getSql = getSql;
//        return this;
//    }
//
////    public Page<T> query(PageInfo pageInfo, Map map) {
////        Query countQuery = em.createNativeQuery(totalSql);
////        countQuery = buildQueryByMapCondition(countQuery, map);
////        Query selectQuery = em.createNativeQuery(getSql, Tuple.class);
////        selectQuery = buildQueryByMapCondition(selectQuery, map);
////        return execute(pageInfo, countQuery, selectQuery);
////    }
//
//
//    public Page<T> execute(PageInfo pageInfo, Query countQuery, Query query) {
////        if (pageInfo.getPageSize() > 100000) {
////            throw new AppException("CM-007");
////        }
//
//        Integer total = ((BigInteger) countQuery.getSingleResult()).intValue();
//        query.setFirstResult(pageInfo.getPageSize() * (pageInfo.getCurrentPage() - 1));
//        query.setMaxResults(pageInfo.getPageSize());
////        List<T> result = DataUtil.convertFromQueryResult(query.getResultList(), genericClass);
////        return new Page<T>(pageInfo).withResult(result).compute(total);
//        return null;
//    }
//
//
////    private Query buildQueryByMapCondition(Query query, Map<String, Object> map) {
////        try {
////            if (!map.isEmpty()) {
////                for (Map.Entry<String, Object> entry : map.entrySet()) {
////                    query.setParameter(entry.getKey(), entry.getValue());
////                }
////            }
////        } catch (Exception ex) {
////            throw new AppException("API001", ex.getMessage());
////        }
////        return query;
////    }
//
////    private static Object isCheckEmpty(Field field, Object object, boolean isTrim) {
////        try {
////            String typeField = field.getType().getTypeName();
////            if (typeField.equalsIgnoreCase(String.class.getName())) {
////                if (DataUtil.isNullOrEmpty((String) field.get(object))) {
////                    return null;
////                }
////            }
////            return isTrim ? ((String) field.get(object)).trim() : field.get(object);
////        } catch (Exception ex) {
////            throw new AppException("API001", ex.getMessage());
////        }
////    }
//
////    private Object queryLike(Field field, Object object) {
////        try {
////            String typeField = field.getType().getTypeName();
////            if (typeField.equalsIgnoreCase(String.class.getName())) {
////                if (DataUtil.isNullOrEmpty((String) field.get(object))) {
////                    return null;
////                }
////            }
////            String value = (String) field.get(object);
////            return "%" + value.trim() + "%";
////        } catch (Exception ex) {
////            throw new AppException("API001", ex.getMessage());
////        }
////    }
//}
