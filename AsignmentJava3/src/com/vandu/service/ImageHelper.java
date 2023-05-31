/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandu.service;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Văn Dự
 */
public class ImageHelper {

    public static Image resize(Image img, int h, int w) {
        Image result = img.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return result;

    }

    public static byte[] ConvertImgaeToByte(Image img, String type) throws Exception {
        BufferedImage bimg = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bimg.createGraphics(); // dùng để vẽ img vào bimg
        g.drawImage(img, 0, 0, null);//tọa dộ 0 0
        g.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream(); // tạo ra một luồng byte
        ImageIO.write(bimg, type, baos);

        byte[] imgInByte = baos.toByteArray();

        return imgInByte;

    }

    public static Image createImageFromByteArray(byte[] data, String type) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        BufferedImage bimg = ImageIO.read(bis);

        Image img = bimg.getScaledInstance(bimg.getWidth(), bimg.getHeight(), Image.SCALE_SMOOTH);
        return img;
    }
}
