package zxing;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

//2-dimensional bar code

public class CreateQRCode {
	public static void main(String[] args) {
		int width=300; 											//设置二维码的宽
		int height=300;											//设置二维码的长
		String format="png";									//设置二维码图片的格式
		String contents="https://github.com/Candy1575";			//设置的连接地址
		
		//二维码参数
		HashMap hints=new HashMap();						
		hints.put(EncodeHintType.CHARACTER_SET,"utf-8");		//设置支持中文编码
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);		//纠错等级。
		hints.put(EncodeHintType.MARGIN, 2);					//边框
		try{
		BitMatrix bitmatrix=new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height);
		File files=new File("D:/img.png");						//文件
		Path file=files.toPath();								//文件路径
		MatrixToImageWriter.writeToPath(bitmatrix, format, file);	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
