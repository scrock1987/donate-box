package com.jkt.donatebox.entity;

public class SuccessResponse {
    private Boolean status;

    public SuccessResponse(final Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }
}
