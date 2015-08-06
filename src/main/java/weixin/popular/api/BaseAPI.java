package weixin.popular.api;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicHeader;

public abstract class BaseAPI {
	protected static final String BASE_URI = "https://api.weixin.qq.com";
	protected static final String MEDIA_URI = "https://api.weixin.qq.com";//http://mp.weixin.qq.com/wiki/14/7e6c03263063f4813141c3e17dd4350a.html
	protected static final String QRCODE_DOWNLOAD_URI = "https://mp.weixin.qq.com";
	protected static final String MCH_URI = "https://api.mch.weixin.qq.com";
	protected static final String OPEN_URI = "https://open.weixin.qq.com";

	protected static Header jsonHeader = new BasicHeader(HttpHeaders.CONTENT_TYPE,ContentType.APPLICATION_JSON.toString());
	protected static Header xmlHeader = new BasicHeader(HttpHeaders.CONTENT_TYPE,ContentType.APPLICATION_XML.toString());
}
