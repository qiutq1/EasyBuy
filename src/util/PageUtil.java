package util;

import java.util.List;

public class PageUtil<T> {
    private Integer pageNo;
    private Integer pageSize;
    private Integer rows;
    private Integer pageTotal;
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public PageUtil(Integer pageNo, Integer pageSize, Integer rows) {
        this.pageSize = pageSize;
        this.rows = rows;

        if (pageSize == 0) {
            this.pageTotal = 0;
        } else {
            this.pageTotal = (int) Math.ceil((double) rows / (double) pageSize);
        }

        if (pageNo == null) {
            this.pageNo = 1;
        } else if (pageNo < 1) {
            this.pageNo = 1;
        } else if (this.pageTotal == 0) {
            this.pageNo = 1;
        } else if (pageNo > this.pageTotal) {
            this.pageNo = this.pageTotal;
        } else {
            this.pageNo = pageNo;
        }

    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }
}
