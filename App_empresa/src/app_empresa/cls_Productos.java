
package app_empresa;


public class cls_Productos {
    
    private int var_codigoInt;
    private String var_nombreStr;
    private String var_EspecificacionesStr;
    private float var_valorFlt;
    private int var_existenciaInt;
    private String var_tipoStr;

    public cls_Productos(int var_codigoInt, String var_nombreStr, String var_EspecificacionesStr, float var_valorFlt, int var_existenciaInt, String var_tipoStr) {
        this.var_codigoInt = var_codigoInt;
        this.var_nombreStr = var_nombreStr;
        this.var_EspecificacionesStr = var_EspecificacionesStr;
        this.var_valorFlt = var_valorFlt;
        this.var_existenciaInt = var_existenciaInt;
        this.var_tipoStr = var_tipoStr;
    }
//getter ---------------------------------------
    
    public int get_codigoInt() {
        return var_codigoInt;
    }

    public String get_nombreStr() {
        return var_nombreStr;
    }

    public String get_EspecificacionesStr() {
        return var_EspecificacionesStr;
    }

    public float get_valorFlt() {
        return var_valorFlt;
    }

    public int get_existenciaInt() {
        return var_existenciaInt;
    }

    public String get_tipoStr() {
        return var_tipoStr;
    }
    // setter --------------------------------------------------------------

    public void set_codigoInt(int var_codigoInt) {
        this.var_codigoInt = var_codigoInt;
    }

    public void set_nombreStr(String var_nombreStr) {
        this.var_nombreStr = var_nombreStr;
    }

    public void set_EspecificacionesStr(String var_EspecificacionesStr) {
        this.var_EspecificacionesStr = var_EspecificacionesStr;
    }

    public void set_valorFlt(float var_valorFlt) {
        this.var_valorFlt = var_valorFlt;
    }

    public void set_existenciaInt(int var_existenciaInt) {
        this.var_existenciaInt = var_existenciaInt;
    }

    public void set_tipoStr(String var_tipoStr) {
        this.var_tipoStr = var_tipoStr;
    }
    
    
}
