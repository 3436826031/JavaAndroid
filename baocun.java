package com.example.aaaa22222;

import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Map;

public class baocun extends Activity{
  EditText zhangh;
    EditText mim;
    Button dengl;
   Button xszhangh;
    Button xsmima;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shil3);
         initView();
        xszhangh=findViewById(R.id.zhanghao2);
        xsmima=findViewById(R.id.mima2);
        zhangh = (EditText) findViewById(R.id.bjk1);
        mim = (EditText) findViewById(R.id.bjk2);


        Map<String, String> useInfo= save.duqu(this);
        xszhangh.setText(save.gg);
        String[] fg=save.gg.split(":");

       /* xsmima.setText(fg[0]);

        Toast.makeText(this, fg[1], Toast.LENGTH_SHORT).show();*/
        zhangh.setText(fg[0]);
        mim.setText(fg[1]);

   if(useInfo!=null){
      /*zhangh.setText(fg[0]);
       xszhangh.setText(useInfo.get("number"));
        mim.setText(fg[1]);
        xsmima.setText(useInfo.get("password"));*/
   }
   else{

       Toast.makeText(this, "没有数据返回", Toast.LENGTH_SHORT).show();

   }


    }

        private void initView(){
            dengl = (Button) findViewById(R.id.an3);
            zhangh = (EditText) findViewById(R.id.bjk1);
            mim = (EditText) findViewById(R.id.bjk2);
        }



        public void onClick1(View view) {
        //获取输入框的文字
            String zhanghao = zhangh.getText().toString();
            String mima = mim.getText().toString();

            //检查字符串是否为空
            if (TextUtils.isEmpty(zhanghao)) {
                Toast.makeText(baocun.this, "请输入账号", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(mima)) {

                Toast.makeText(baocun.this, "输入密码", Toast.LENGTH_SHORT).show();
                   return;
            }

            Toast.makeText(baocun.this, "开始保存", Toast.LENGTH_SHORT).show();

            boolean bc = save.saveUser(this, zhanghao, mima);

            xszhangh=findViewById(R.id.zhanghao2);
            xsmima=findViewById(R.id.mima2);


              if(bc) {

                  Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();

                /*  xszhangh.setText(zhanghao);
                  xsmima.setText(mima);*/

              }else{
                  Toast.makeText(this, "保存失败", Toast.LENGTH_SHORT).show();

              }

    }



/*



    public void baocun() {

    }

    EditText editText=findViewById(R.id.wenben);


    */
/*************************保存信息***************************//*


    public void bcwenb(View view){

        FileOutputStream fos=null;
        String neir=editText.getText().toString();//获取编辑框的信息
        try {



            fos=openFileOutput("wenben",MODE_PRIVATE);//获取文件输出流对象
            fos.write(neir.getBytes());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fos.close();
                Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    FileInputStream fis=null;
  byte[] bytes=null;



    */
/********************读取保存的备忘信息*******************//*

    public void duqu(View view){

        try {
            fis=openFileInput("wenben");
            bytes=new byte[fis.available()];//实例化字节数组来储存数据available用来获取数组最大值
            fis.read(bytes);





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fis.close();
                String dqnr=new String(bytes);

                editText.setText(dqnr);




            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }



*/







}