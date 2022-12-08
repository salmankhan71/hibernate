package com.src;

public class StudentAddress {
private String parAddress,curAddress;

public String getParAddress() {
	return parAddress;
}

public void setParAddress(String parAddress) {
	this.parAddress = parAddress;
}

public String getCurAddress() {
	return curAddress;
}

public void setCurAddress(String curAddress) {
	this.curAddress = curAddress;
}

@Override
public String toString() {
	return "StudentAddress [parAddress=" + parAddress + ", curAddress=" + curAddress + "]";
}

}
