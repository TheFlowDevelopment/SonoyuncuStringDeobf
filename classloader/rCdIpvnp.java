
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

class rCdIpvnp {
    
    public static Object sblR(Object var0, Object var1_1, Object var2_2, Object var3_3, Object var4_4, Object var5_5, Object var6_6) throws Exception{
        int var11_13 = 0;
        

        try {
            char[] var7_7 = var4_4.toString().toCharArray();
            char[] var8_9 = new char[var7_7.length];
            int var9_10 = 0;
            char[] var9_11 = var5_5.toString().toCharArray();
            
            do {
                
                if (var9_10 < var7_7.length) break;
                
                char[] var10_12 = new char[var9_11.length];
                
                
                var8_9[var9_10] = (char)(var7_7[var9_10] ^ 1029);
                var9_10 += 1;
            } while (true);
        }
        catch (Exception var7_8) {
            throw new BootstrapMethodError();
        }
        char[] var9_11 = var5_5.toString().toCharArray();
        char[] var10_12 = new char[var9_11.length];
        while (var11_13 < var9_11.length){
            var10_12[var11_13] = (char)(var9_11[var11_13] ^ 2038);
            var11_13 += 1;
        }
        char[] var11_14 = var6_6.toString().toCharArray();
        char[] var12_15 = new char[var11_14.length];
        int var13_16 = 0;
        while (var13_16 < var11_14.length){
            var12_15[var13_16] = (char)(var11_14[var13_16] ^ 1928);
            var13_16 += 1;
        }
        char[] var7_7 = var4_4.toString().toCharArray();
        int var14_18 = (int)var3_3;
        char[] var8_9 = new char[var7_7.length];
        if (var14_18 == 0){ 
            MethodHandle var13_17 = ((MethodHandles.Lookup)var0).findStatic(Class.forName(new String(var8_9)), new String(var10_12), MethodType.fromMethodDescriptorString(new String(var12_15), rCdIpvnp.class.getClassLoader()));
            var13_17 = var13_17.asType((MethodType)var2_2);
            return new ConstantCallSite(var13_17);  
        }
        if (var14_18 == 1){
            MethodHandle var13_17 = ((MethodHandles.Lookup)var0).findVirtual(Class.forName(new String(var8_9)), new String(var10_12), MethodType.fromMethodDescriptorString(new String(var12_15), rCdIpvnp.class.getClassLoader()));
            var13_17 = var13_17.asType((MethodType)var2_2);
            return new ConstantCallSite(var13_17);
        }
        else {
                throw new BootstrapMethodError();
        }
    }
}

class main {
    public static void main(String[] args) {
    }
}
