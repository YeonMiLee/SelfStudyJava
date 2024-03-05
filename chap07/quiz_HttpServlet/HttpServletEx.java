package quiz_HttpServlet;

public class HttpServletEx {
	public static void main(String[] args) {
		//결과출력
		FileDownloadServlet file = new FileDownloadServlet();
		LoginServlet login = new LoginServlet();
		login.service();
		file.service();
		
//		method(new LoginServlet());
//		method(new FileDownloadServlet());
	}
//		public static void method(HttpServlet servlet) {
//			servlet.service();
//}

	
}
