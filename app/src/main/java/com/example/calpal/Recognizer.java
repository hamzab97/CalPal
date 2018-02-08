package com.example.calpal;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifiedImages;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by hamza on 2018-02-07.
 */

public class Recognizer {

    private ClassifiedImages result;

    public Recognizer(VisualRecognition service) throws FileNotFoundException {
        String name = "image";
        InputStream imagesStream = new FileInputStream(name);
        ClassifyOptions classifyOptions = new ClassifyOptions.Builder().imagesFile(imagesStream).build();
        this.result = service.classify(classifyOptions).execute();
    }
//use imagehosting API (Imgur) to upload the pic and then read the url
    public ClassifiedImages getResult(ClassifiedImages result){
        return result;
    }
}
