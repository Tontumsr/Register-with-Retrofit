package com.Tumton.hotelapp.activies.data.remote.models.response;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

	@SerializedName("path")
	private String path;

	@SerializedName("error")
	private String error;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private int status;

	public void setPath(String path){
		this.path = path;
	}

	public String getPath(){
		return path;
	}

	public void setError(String error){
		this.error = error;
	}

	public String getError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"LoginRespone{" + 
			"path = '" + path + '\'' + 
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}

	public String getAccessToken() {
		return null;
	}

	public String getRefreshToken() {
		return null;
	}
}