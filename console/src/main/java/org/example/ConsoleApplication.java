
package org.example;

import org.example.exception.FileCacheException;
import org.example.init.FileCacheManagerInit;
import org.example.init.HotModuleInitMachine;
import org.example.init.InitWorld;
import org.example.init.ModuleSrcConfigFileInit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @author Genius
 * @date 2023/04/20 00:16
 **/

@SpringBootApplication
public class ConsoleApplication {

    public static void main(String[] args) {
        if (Init()) {
            SpringApplication.run(ConsoleApplication.class, args);
        }
    }

    public static boolean Init(){
        return InitWorld.getInstance()
                .setInitMachines(
                        List.of(
                        new ModuleSrcConfigFileInit(),
                        new FileCacheManagerInit(),
                        new HotModuleInitMachine()
                        )
                ).start();
    }
}
