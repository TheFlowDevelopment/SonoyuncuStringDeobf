import java.util.HashMap;

class EfXJProfile {
    private static HashMap hsmp;
    public static final boolean azeri = true;

    private static /* bridge */ /* synthetic */ String MQAq(String string) {
        return (String)hsmp.get(string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* bridge */ /* synthetic */ String fWuO(String var0, int var1_1) {
        String var5_2 = var0 + var1_1;
        StringBuilder var3_4 = new StringBuilder();
        
        
        if (EfXJProfile.MNzu(var5_2)) {
            return EfXJProfile.MQAq(var5_2);
        }
        char[] var2_3 = var0.toCharArray();
        
        int var4_5 = 0;
        while (var4_5 < var2_3.length){ 
            var3_4.append((char)(var2_3[var4_5] ^ var1_1));
            var4_5+= 1;
        }
        String var4_6 = var3_4.toString();
        EfXJProfile.LOSj(var5_2, var4_6);
        return var4_6;
    }

    static /* synthetic */ {
        hsmp = new HashMap<String, String>();
    }

    private static /* bridge */ /* synthetic */ void LOSj(String string, String string2) {
        hsmp.put(string, string2);
    }

    private static /* bridge */ /* synthetic */ boolean MNzu(String string) {
        return hsmp.containsKey(string);
    }
}

class main {
public static void main(String[] args) {
    /* ÖRNEK | EXMP */
    String hh = EfXJProfile.fWuO("\u189e\u1884\u1880\u188a", -637462295); /* BURAYA EfXJ$Profile DAKİ $ SİLİNİP KOYULACAK | DELETE $ IN EfXJ$Profile AND PASTE IT HERE */
    System.out.println(hh);
}
}
