
public class Hits {
	private String iPaddr;
	private String request;
	private String dateTime;
	private int response;
	private int size;
	private String referer;
	private String userAgent;
	private String protocal;

	/**
	 * @param iPaddr
	 * @param request
	 * @param dateTime
	 * @param response
	 * @param size
	 * @param referer
	 * @param userAgent
	 */
	public Hits(String iPaddr, String request, String protocal, String dateTime,
			int response, int size, String referer, String userAgent) {
		this.iPaddr = iPaddr;
		this.request = request;
		this.protocal = protocal;
		this.dateTime = dateTime;
		this.response = response;
		this.size = size;
		this.referer = referer;
		this.userAgent = userAgent;
	}

	/**
	 * @return the iPaddr
	 */
	public String getiPaddr() {
		return iPaddr;
	}

	/**
	 * @return the request
	 */
	public String getRequest() {
		return request;
	}

	/**
	 * @return the dateTime
	 */
	public String getDateTime() {
		return dateTime;
	}

	/**
	 * @return the response
	 */
	public int getResponse() {
		return response;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the referer
	 */
	public String getReferer() {
		return referer;
	}

	/**
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * @param iPaddr
	 *            the iPaddr to set
	 */
	public void setiPaddr(String iPaddr) {
		this.iPaddr = iPaddr;
	}

	/**
	 * @param request
	 *            the request to set
	 */
	public void setRequest(String request) {
		this.request = request;
	}

	/**
	 * @param dateTime
	 *            the dateTime to set
	 */
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(int response) {
		this.response = response;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param referer
	 *            the referer to set
	 */
	public void setReferer(String referer) {
		this.referer = referer;
	}

	/**
	 * @param userAgent
	 *            the userAgent to set
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hits [iPaddr=" + iPaddr + ", request=" + request + ", dateTime="
				+ dateTime + ", response=" + response + ", size=" + size
				+ ", referer=" + referer + ", userAgent=" + userAgent + "]\n";
	}

}