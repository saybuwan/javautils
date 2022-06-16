package com.insigma.File;

import java.io.File;
import java.util.List;

public interface FileUtil {

    /**
     * 获取文件夹下所有某个类型的文件
     * @param pathStr  路径文本值
     * @param fileType 文件类型
     * @return
     */
    public List<File> readAllFileByType(String pathStr, FileType fileType);

    /**
     * 获取文件夹下所有文件
     * @param pathStr
     * @return
     */
    public List<File> readAllFile(String pathStr);

    boolean writeFileToPath(String pathStr);
}
