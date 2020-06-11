package com.cp.testfabric.imgTest;

import java.io.IOException;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ImgTest {

    @Test
    public void imgTest() throws IOException, InterruptedException, IM4JavaException
    {
        ConvertCmd cmd = new ConvertCmd();
        IMOperation op = new IMOperation();
        op.addImage("b.png");
        op.addImage("a.svg");
        cmd.run(op);
    }

}