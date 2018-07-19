package com.tdo1szh.scanning.activitys;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.WriterException;
import com.tdo1szh.scanning.R;
import com.tdo1szh.scanning.utils.GenerateUtils;

public class GenerateBarActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditText;
    private ImageView mImageView;
    private TextView mTVQr;
    private TextView mTVBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_bar);
        mEditText = (EditText) findViewById(R.id.et_content);
        mImageView = (ImageView) findViewById(R.id.iv_code);
        mTVQr = (TextView) findViewById(R.id.tv_qr);
        mTVBar = (TextView) findViewById(R.id.tv_bar);

        mTVBar.setOnClickListener(this);
        mTVQr.setOnClickListener(this);
    }

    public void generateQRCode() {
        String text = mEditText.getText().toString();
        if (!TextUtils.isEmpty(text) && text.length() > 0) {
            try {
                Bitmap bitmap = GenerateUtils.generateQRCode(text, 300);
                mImageView.setImageBitmap(bitmap);
            } catch (WriterException e) {
                e.printStackTrace();
            }
        } else {
            Toast.makeText(this,"未输入内容。",Toast.LENGTH_SHORT).show();
        }
    }

    public void generateBarCode() {
        String text = mEditText.getText().toString();
        if (!TextUtils.isEmpty(text) && text.length() > 0) {
            Bitmap bitmap = GenerateUtils.generateBarCode(text, 300,150);
            mImageView.setImageBitmap(bitmap);
        } else {
            Toast.makeText(this,"未输入内容。",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_qr:
                generateQRCode();
                break;
            case R.id.tv_bar:
                generateBarCode();
                break;
        }
    }
}
