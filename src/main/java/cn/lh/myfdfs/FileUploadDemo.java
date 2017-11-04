package cn.lh.myfdfs;

import java.io.File;
import java.util.Arrays;

import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.core.io.ClassPathResource;

public class FileUploadDemo {
	public static void main(String[] args) throws Exception{
		
		File file=new File("D:"+File.separator+"221739.jpg");
		String ext="jpg";
		ClassPathResource classPathResource=new ClassPathResource("fdstfds.properties");
		ClientGlobal.init(classPathResource.getClassLoader().getResource("fdstfds.properties").getPath());
		TrackerClient trackerClient=new TrackerClient();
		TrackerServer trackerServer=trackerClient.getConnection();
		StorageServer storageServer=null;
		StorageClient client=new StorageClient(trackerServer, storageServer);
		
		NameValuePair[] nameValuePairs=new NameValuePair[3];
		nameValuePairs[0]=new NameValuePair("filename",file.getName());
		nameValuePairs[1]=new NameValuePair("fileExtName",ext);
		nameValuePairs[2]=new NameValuePair("fileLength",String.valueOf(file.length()));
		
		String [] upload_img=client.upload_appender_file(file.getPath(), ext, nameValuePairs);
		
		System.out.println(Arrays.toString(upload_img));
	}
}
