package xmmt.dituon.example;

import org.junit.BeforeClass;
import org.junit.Test;
import xmmt.dituon.share.BaseServiceConfig;
import xmmt.dituon.share.TextExtraData;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class PluginDataTest extends AbstractTest {

    @BeforeClass
    public static void init() {
        BaseServiceConfig config = new BaseServiceConfig();
        petService.readBaseServiceConfig(config);
        petService.readData(new File("./data/xmmt.dituon.petpet"));
    }

    @Test
    public void testThrow() throws IOException {
        testGeneral("testThrow", "throw", null, null);
    }

}
