package com.tdo1szh.scanning.utils;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.util.HashMap;

public class GenerateUtils {

    private static final int BLACK = 0xff000000;
    private static final int WHITE = 0xffffffff;

    public static Bitmap generateQRCode(String content, int widthAndHeight) throws WriterException {
        HashMap<EncodeHintType, Object> parm = new HashMap();
        parm.put(EncodeHintType.CHARACTER_SET,"utf-8");
        parm.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        parm.put(EncodeHintType.MARGIN,2);

        BitMatrix matrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, widthAndHeight, widthAndHeight, parm);
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int[] pixels = new int[width * height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (matrix.get(x, y)) {
                    pixels[y * width + x] = BLACK;
                }
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(width, height,
                Bitmap.Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return bitmap;
    }

    public static Bitmap generateBarCode(String content, int desiredWidth, int desiredHeight) {
        Bitmap bitmap = null;
        int marginW = 20;
        BarcodeFormat barcodeFormat = BarcodeFormat.CODE_128;
        MultiFormatWriter writer = new MultiFormatWriter();
        BitMatrix result = null;
        try {
            result = writer.encode(content, barcodeFormat, desiredWidth,
                    desiredHeight, null);
        } catch (WriterException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int width = result.getWidth();
        int height = result.getHeight();
        int[] pixels = new int[width * height];
        for (int y = 0; y < height; y++) {
            int offset = y * width;
            for (int x = 0; x < width; x++) {
                pixels[offset + x] = result.get(x, y) ? BLACK : WHITE;
            }
        }

        bitmap = Bitmap.createBitmap(width, height,
                Bitmap.Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);

        return bitmap;
    }
}
