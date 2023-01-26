package datalevin.javacpp;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
    value = @Platform(
        includepath = {"/usr/include", "../src/c"},
        cinclude = {"lmdb/libraries/liblmdb/lmdb.h", "dtlv.h"},
        linkpath = {"../src/c"},
        link = {"dtlv", "lmdb"}
    ),
    target = "datalevin.javacpp.Lib"
)
public class Config implements InfoMapper {
    public void map(InfoMap infoMap) {
      infoMap
          .put(new Info("mdb_mode_t").cast().valueTypes("int").pointerTypes("IntPointer", "IntBuffer", "int[]"))
          .put(new Info("mdb_filehandle_t").cast().valueTypes("int").pointerTypes("IntPointer"))
          .put(new Info("MDB_VERINT").cppText("#define MDB_VERINT"))
          .put(new Info("MDB_VERSION_FULL").cppText("#define MDB_VERSION_FULL"))
          .put(new Info("MDB_VERSTR").cppText("#define MDB_VERSTR"))
          .put(new Info("MDB_VERFOO").cppText("#define MDB_VERFOO"))
          .put(new Info("MDB_VERSION_STRING").cppText("#define MDB_VERSION_STRING"));
    }
}
