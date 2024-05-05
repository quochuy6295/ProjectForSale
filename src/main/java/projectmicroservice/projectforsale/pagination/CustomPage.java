package projectmicroservice.projectforsale.pagination;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class CustomPage implements Pageable {
    private int pageNumber;
    private int pageSize;

    public CustomPage(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    @Override
    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    @Override
    public long getOffset() {
        return (long) pageNumber * pageSize;
    }

    @Override
    public Sort getSort() {
        return Sort.unsorted(); // Trả về Sort.unsorted() nếu không cần sắp xếp
    }

    @Override
    public Pageable next() {
        return null;
        // Implement logic cho phương thức next() nếu cần
    }

    @Override
    public Pageable previousOrFirst() {
        return null;
        // Implement logic cho phương thức previousOrFirst() nếu cần
    }

    @Override
    public Pageable first() {
        return null;
    }

    @Override
    public Pageable withPage(int pageNumber) {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        // Implement logic cho phương thức hasPrevious() nếu cần
        return true;
    }
}
