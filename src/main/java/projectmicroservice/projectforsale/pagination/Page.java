package projectmicroservice.projectforsale.pagination;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    private List<T> result;

    private int currentPage;
    private int pageSize;

    private int totalPage;
    private int totalRecord;

    public Page(){
    }

    public Page<T> withResult(List<T> result){
        this.result = result;
        return this;
    }

    public Page<T> compute(int totalRecord){
        this.totalRecord = totalRecord;
        this.totalPage = (int) Math.ceil((double) totalRecord/pageSize);
        return this;
    }
}
