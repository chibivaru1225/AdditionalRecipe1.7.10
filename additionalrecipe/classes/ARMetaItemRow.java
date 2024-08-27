package chibivaru.additionalrecipe.classes;

import net.minecraft.util.IIcon;

public class ARMetaItemRow {
    public String Name;
    public IIcon Icon;
    public boolean Effect;
    public int Color;

    public ARMetaItemRow(String name, IIcon icon, boolean effect, int color) {
        this.Name = name;
        this.Icon = icon;
        this.Effect = effect;
        this.Color = color;
    }
}
