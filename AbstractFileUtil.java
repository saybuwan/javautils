package com.insigma.File;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFileUtil implements FileUtil {

    public List<File> readAllFileByType(String pathStr, FileType fileType) {

       return readAllFileByTypeWarpper(pathStr,fileType);

    }
 private List<File> readAllFileByTypeWarpper(String pathStr, FileType fileType){
        List<File> FileList = new ArrayList<>();
        readDir(pathStr,FileList,fileType);
        return FileList;
 }



    public void readDir(String path, List<File> fileList, FileType fileType) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            System.out.println(files.length);
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                if (files[i].isDirectory()) {
                    readDir(files[i].getPath(), fileList, fileType);
                } else {
                    if (fileType != null) {
                        if (fileName.endsWith(fileType.getFILETYPE())) {
                            fileList.add(files[i]);
                        }
                    }else{
                        fileList.add(files[i]);
                    }
                }
            }
        }

    }

    /**
     * 获取文件夹下所有文件
     *
     * @param pathStr
     * @return
     */
    public List<File> readAllFile(String pathStr) {
            return  readAllFileWarpper(pathStr);
    }


    private List<File> readAllFileWarpper(String pathStr) {
        List<File> FileList = new ArrayList<>();
        readDir(pathStr,FileList,null);
        return FileList;
    }
//
//   public boolean writeFileToPath(byte b, String pathStr){
//        //TODO  如果传入的路径后面带有文件名，需要处理一下
//       Path path = Paths.get(pathStr);
//       try {
//           Files.createDirectories(path);
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//       try {
//           FileChannel open = FileChannel.open(path);
//           open.write()
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//
//   }
}
