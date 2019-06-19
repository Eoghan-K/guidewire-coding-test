package com.eoghan;

import java.util.Arrays;

public class Solution {
    public String solution(String s){
        String result;
        int music = 0;
        int images = 0;
        int movie = 0;
        int other = 0;
        String[] arr = s.split("\n");
        for (String file : arr){
            String[] splitFile = file.split(" ");
            String fileType = "";
            int fileSize = 0;
            for (String f : splitFile){
                if ( Arrays.asList(splitFile).indexOf(f) % 2 == 0){
                    fileType = getFileType(f);
                } else {
                    fileSize = getFileSize(f);
                }
                    switch (fileType){
                        case ".mp3":
                        case ".aac":
                        case ".flac":
                            music += fileSize;
                            break;
                        case ".jpg":
                        case ".bmp":
                        case ".gif":
                            images += fileSize;
                        case ".mp4":
                        case ".avi":
                        case ".mkv":
                            movie += fileSize;
                            break;
                        default:
                            other += fileSize;
                    }
                }

            }


        result = "music " + music + "b\n"
                + "images " + images + "b\n"
                + "movies " + movie + "b\n"
                + "other " + other + "b\n";
        return result;
    }

    private int getFileSize(String f) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) != 'b') {
                stringBuilder.append(f.charAt(i));
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    private String getFileType(String f) {
        String fileType = "";
        for(int i = f.length() -1; i > 0; i--){
            if (f.charAt(i) == '.'){
                fileType = f.substring(i);
                break;
            }
        }
        return fileType;
    }
}
