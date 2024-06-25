package com.tutorial.bootdemo;

public class Response <T> {

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public String getErrormsg() {
    return errormsg;
  }

  public void setErrormsg(String errormsg) {
    this.errormsg = errormsg;
  }

  private T data;
  private boolean success;
  private String errormsg;

  public static <K> Response<K> newSuccess(K data) {
    Response response = new Response();
    response.setData(data);
    response.setSuccess(true);
    return response;
  }

  public static Response<Void> newFail(String errorMsg) {
    Response<Void> response  = new Response<>();
    response.setErrormsg(errorMsg);
    response.setSuccess(false);
    return response;

  }



}
