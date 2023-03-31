package org.example;

import org.example.module.ModuleWritter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WritterTxtAndCSV implements ModuleWritter {
    @Override
    public boolean writterTxtAndCsv(String save, List<String> data) {
        try {
            BufferedWriter bwr = new BufferedWriter(new FileWriter(new File(save)));
            bwr.write("REKAP NILAI\n\n");

            /*
                lambda dan juga menggunakan forEach sebagai output masukan
                dan juga menggunakan runtimeException
             */
            data.forEach(a -> {
                try {
                    bwr.write(a + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            //for (int i = 0; i < data.size(); i++) bwr.write(data.get(i) + "\n");

            bwr.newLine();
            bwr.flush();
            bwr.close();
            System.out.println("succesfully written to a file");
            return true;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
