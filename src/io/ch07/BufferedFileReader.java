package io.ch07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReader {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        try {
            // 기반 스트림 - 파일 대상 읽기
            fr = new FileReader("assets/a.txt");
            // 보조 스트림 - 기반 스트림을 감싸야 함
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 닫을 때는 역순(보조->기반)으로 닫아야 함
                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
