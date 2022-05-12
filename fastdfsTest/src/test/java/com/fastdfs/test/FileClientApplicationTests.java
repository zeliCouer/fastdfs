package com.fastdfs.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileClientApplicationTests {
 
	@Test
	public void Upload() {
		String fileUrl = "D:\\ideapj\\fastdfsTest\\src\\test\\java\\com\\fastdfs\\test\\test.jpg";
		System.out.println(fileUrl);
		File file = new File(fileUrl);
		String str = FastDFSClient.uploadFile(file);
		FastDFSClient.getResAccessUrl(str);
	}
 
	@Test
	public void Delete() {
		FastDFSClient.deleteFile("group1/M00/00/00/eBnpUmJ7L8WAMg-MAAK-ocTaEVg269.jpg");
	}
}