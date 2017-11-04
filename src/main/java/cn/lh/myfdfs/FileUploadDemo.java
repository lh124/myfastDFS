package cn.lh.myfdfs;

import java.io.File;

public class FileUploadDemo {
	public static void main(String[] args) throws Exception{
		/*	File file=new File("D:"+File.separator+"221739.jpg");
		byte [] data=new byte[(int)file.length()];
		InputStream inputStream =new FileInputStream(file);
		inputStream.read(data);
		inputStream.close();
		String ext="jpg";
		ClassPathResource classPathResource=new ClassPathResource("fdstfds.properties");
		ClientGlobal.init(classPathResource.getClassLoader().getResource("fdstfds.properties").getPath());
		TrackerClient trackerClient=new TrackerClient();
		TrackerServer trackerServer=trackerClient.getConnection();
		StorageServer storageServer=null;
//		StorageClient client=new StorageClient(trackerServer, storageServer);
		StorageClient1 client=new StorageClient1(trackerServer, storageServer);

		NameValuePair[] nameValuePairs=new NameValuePair[3];
		nameValuePairs[0]=new NameValuePair("filename",file.getName());
		nameValuePairs[1]=new NameValuePair("fileExtName",ext);
		nameValuePairs[2]=new NameValuePair("fileLength",String.valueOf(file.length()));

//		String [] upload_img=client.upload_file(file.getPath(), ext, nameValuePairs);
		String upload_img=client.upload_file1(file.getPath(), ext, nameValuePairs);
		System.out.println(upload_img);*/


		upload client = new upload("fdstfds.properties");
		String result = client.uploadFile("D:"+File.separator+"221739.jpg", "jpg");
		System.out.println(result);
	}




}
