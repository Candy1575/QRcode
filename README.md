# QRcode
2-dimensional bar code
# QRcode
2-dimensional bar code

二维码的分类：
//线性堆叠式二维码
//矩阵式二维码
//邮政码

/*
 * 目前流行的三大国际标准
 * PDF417：不支持中文
 * DM：专利未公开，需支付专利费用
 * QR code：专利公开，支持中文
 * Quick Response Code

 * QR code比其他二维码相比，具有识读速度快，数据密度大，占用空间小的优势。
 * QR Code是有日本Demso公司于1994年研制的一种矩阵二维码符号码

 * 纠错能力：
 * L级：约可纠错7%的数据码字
 * M级：约可纠错15%的数据码字
 * Q级：约可纠错25%的数据码字
 * H级：约可纠错30%的数据码字
 * 纠错能力越高，存储的数据就越少
 * 
 * 第一种方法
 * 借助第三方jar如zxing和QR Code jar
 * 第二种方法
 * javascript如jQuery.qrcode.js
 * /

/*
 *   在我实践的过程中，myeclipse找不到java.nio.file.Files这个包
 * 找不到这个包就会导致new File().toPath()用不了,myeclipse代码提示用getPath();
 * 通过上网上查阅相关资料 解决方法如下：
 * 没有使用系统的JRE,而是用myeclipse自带的JRE，系统的JRE里面有java.nio。
 * 项目的JRE System Library上面点击属性（properties）
 * 在Execution environment把原本的javaSE-1.6（sun JDK 1.6.0_13）
 * 改成你系统的（我本机是JavaSE-1.7(jdk1.7.0_79)）;
 */

/*
*  编译时,发现了一个小bug
* 
*  zxing包下的CreateQRCode生成的二维码正常，
*  并且zxing包和qrcode包下的ReadQRCode都可以正常编译。
* 
*  在qrcode包下的CreateQRCode生成的二维码，用微信扫不出来，
*  而且用qrcode包下的ReadQRCode编译时会生成一串数字，
*  但是用zxing包下的ReadQRCode编译时通过（在控制台打印出https://github.com/Candy1575）
* 
*/
