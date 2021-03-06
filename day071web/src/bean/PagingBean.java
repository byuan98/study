package bean;

import java.util.List;

public class PagingBean<E>{//泛型类，此类中涉及到的某个类型是变量
    private Integer pageNumber;//当前页数
    private Integer pageTotal;//总页数
    private Integer pageSize;//每页记录数
    private Integer count;//总记录数
    private Integer startIndex;//起始索引
    private List<E> list;//当前页要显示的记录信息
    private String queryString;//查询条件
    
    public PagingBean() {

    }
    public PagingBean(Integer pageNumber, Integer pageSize, Integer count, List<E> list) {
        this.pageNumber = pageNumber;//当前页数
        this.pageSize = pageSize;//每页记录数
        this.count = count;//总记录数
        this.list = list;//当前页要显示的记录信息
    }
    
    public Integer getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(Integer pageNumber) {
        if(pageNumber<=0) {pageNumber=1;}
        pageNumber=pageNumber>getPageTotal()?getPageTotal():pageNumber;
        
        this.pageNumber = pageNumber;
    }
    public Integer getPageTotal() {
        return count/getPageSize()+(count%getPageSize()==0?0:1);
    }
//    public void setPageTotal(Integer pageTotal) {//总页数
//        this.pageTotal = pageTotal;
//    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Integer getStartIndex() {
        return (pageNumber-1)*pageSize;
    }
//    public void setStartIndex(Integer startIndex) {//起始索引是算出来的不需要set方法
//        this.startIndex = startIndex;
//    }
    public List<E> getList() {
        return list;
    }
    public void setList(List<E> list) {
        this.list = list;
    }
    public String getQueryString() {
        return queryString;
    }
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }
}
