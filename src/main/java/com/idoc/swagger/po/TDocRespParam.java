package com.idoc.swagger.po;

public class TDocRespParam {
    private Integer id;

    private Integer pathItemId;

    private String name;

    private String type;

    private String cut;

    private Integer refId;

    private Boolean isarr;

    private Integer parrentId;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPathItemId() {
        return pathItemId;
    }

    public void setPathItemId(Integer pathItemId) {
        this.pathItemId = pathItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut == null ? null : cut.trim();
    }

    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public Boolean getIsarr() {
        return isarr;
    }

    public void setIsarr(Boolean isarr) {
        this.isarr = isarr;
    }

    public Integer getParrentId() {
        return parrentId;
    }

    public void setParrentId(Integer parrentId) {
        this.parrentId = parrentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}