package divinerpg.objects.entities.assets.model.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelGalroid extends ModelBase
{
    //fields
    ModelRenderer horn1;
    ModelRenderer body1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg1;
    ModelRenderer rightleg2;
    ModelRenderer leftleg2;
    ModelRenderer rightleg3;
    ModelRenderer leftleg3;
    ModelRenderer rightleg4;
    ModelRenderer rightleg5;
    ModelRenderer leftleg4;
    ModelRenderer leftleg5;
    ModelRenderer leftarm1;
    ModelRenderer rightarm1;
    ModelRenderer leftarm2;
    ModelRenderer leftarm3;
    ModelRenderer leftarm4;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm4;
    ModelRenderer rightarm5;
    ModelRenderer leftarm5;
    ModelRenderer rightarm6;
    ModelRenderer leftarm6;
    ModelRenderer rightarm7;
    ModelRenderer rightarm8;
    ModelRenderer rightarm9;
    ModelRenderer leftarm7;
    ModelRenderer leftarm8;
    ModelRenderer leftarm9;
    ModelRenderer rightarm10;
    ModelRenderer rightarm11;
    ModelRenderer rightarm12;
    ModelRenderer rightarm13;
    ModelRenderer rightarm14;
    ModelRenderer rightarm15;
    ModelRenderer rightarm16;
    ModelRenderer rightarm17;
    ModelRenderer rightarm18;
    ModelRenderer leftarm10;
    ModelRenderer leftarm11;
    ModelRenderer leftarm12;
    ModelRenderer leftarm13;
    ModelRenderer leftarm14;
    ModelRenderer leftarm15;
    ModelRenderer leftarm16;
    ModelRenderer leftarm17;
    ModelRenderer leftarm18;
    ModelRenderer rightarm19;
    ModelRenderer rightarm20;
    ModelRenderer rightarm21;
    ModelRenderer rightarm22;
    ModelRenderer rightarm23;
    ModelRenderer rightarm24;
    ModelRenderer rightarm25;
    ModelRenderer rightarm26;
    ModelRenderer leftarm19;
    ModelRenderer leftarm20;
    ModelRenderer leftarm22;
    ModelRenderer leftarm21;
    ModelRenderer leftarm23;
    ModelRenderer leftarm24;
    ModelRenderer leftarm25;
    ModelRenderer leftarm26;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer head;
    ModelRenderer horn2;
    ModelRenderer horn3;
    ModelRenderer horn4;
    ModelRenderer leftarm27;
    ModelRenderer rightarm27;

    public ModelGalroid()
    {
        textureWidth = 128;
        textureHeight = 32;

        horn1 = new ModelRenderer(this, 6, 0);
        horn1.addBox(0F, -15F, 1F, 2, 13, 2);
        horn1.setRotationPoint(0F, -8F, 0F);
        horn1.setTextureSize(128, 32);
        horn1.mirror = true;
        setRotation(horn1, 0F, 0F, 0.6108652F);
        body1 = new ModelRenderer(this, 60, 21);
        body1.addBox(-4F, 0F, -2F, 8, 6, 4);
        body1.setRotationPoint(4F, -6F, 2F);
        body1.setTextureSize(128, 32);
        body1.mirror = true;
        setRotation(body1, 0F, 0F, 0F);
        rightleg1 = new ModelRenderer(this, 54, 25);
        rightleg1.addBox(2F, 7F, 1F, 1, 5, 1);
        rightleg1.setRotationPoint(-4F, 12F, 0F);
        rightleg1.setTextureSize(128, 32);
        rightleg1.mirror = true;
        setRotation(rightleg1, 0F, 0F, 0F);
        leftleg1 = new ModelRenderer(this, 54, 25);
        leftleg1.addBox(2F, 7F, 1F, 1, 5, 1);
        leftleg1.setRotationPoint(4F, 12F, 0F);
        leftleg1.setTextureSize(128, 32);
        leftleg1.mirror = true;
        rightleg2 = new ModelRenderer(this, 50, 18);
        rightleg2.addBox(-1F, -4F, -1F, 2, 4, 2);
        rightleg2.setRotationPoint(-4F, 12F, 0F);
        rightleg2.setTextureSize(128, 32);
        rightleg2.mirror = true;
        setRotation(rightleg2, 0F, 0F, 0F);
        leftleg2 = new ModelRenderer(this, 50, 18);
        leftleg2.addBox(-1F, -4F, -1F, 2, 4, 2);
        leftleg2.setRotationPoint(4F, 12F, 0F);
        leftleg2.setTextureSize(128, 32);
        leftleg2.mirror = true;
        setRotation(leftleg2, 0F, 0F, 0F);
        rightleg3 = new ModelRenderer(this, 54, 25);
        rightleg3.addBox(-3F, 7F, 1F, 1, 5, 1);
        rightleg3.setRotationPoint(-4F, 12F, 0F);
        rightleg3.setTextureSize(128, 32);
        rightleg3.mirror = true;
        setRotation(rightleg3, 0F, 0F, 0F);
        leftleg3 = new ModelRenderer(this, 55, 25);
        leftleg3.addBox(-3F, 7F, 1F, 1, 5, 1);
        leftleg3.setRotationPoint(4F, 12F, 0F);
        leftleg3.setTextureSize(128, 32);
        leftleg3.mirror = true;
        setRotation(leftleg3, 0F, 0F, 0F);
        rightleg4 = new ModelRenderer(this, 72, 13);
        rightleg4.addBox(-3F, 9F, -3F, 2, 3, 4);
        rightleg4.setRotationPoint(-4F, 12F, 0F);
        rightleg4.setTextureSize(128, 32);
        rightleg4.mirror = true;
        setRotation(rightleg4, 0F, 0F, 0F);
        rightleg5 = new ModelRenderer(this, 72, 13);
        rightleg5.addBox(1F, 9F, -3F, 2, 3, 4);
        rightleg5.setRotationPoint(-4F, 12F, 0F);
        rightleg5.setTextureSize(128, 32);
        rightleg5.mirror = true;
        setRotation(rightleg5, 0F, 0F, 0F);
        leftleg4 = new ModelRenderer(this, 72, 13);
        leftleg4.addBox(-3F, 9F, -3F, 2, 3, 4);
        leftleg4.setRotationPoint(4F, 12F, 0F);
        leftleg4.setTextureSize(128, 32);
        leftleg4.mirror = true;
        setRotation(leftleg4, 0F, 0F, 0F);
        leftleg5 = new ModelRenderer(this, 72, 13);
        leftleg5.addBox(1F, 9F, -3F, 2, 3, 4);
        leftleg5.setRotationPoint(4F, 12F, 0F);
        leftleg5.setTextureSize(128, 32);
        leftleg5.mirror = true;
        setRotation(leftleg5, 0F, 0F, 0F);
        leftarm1 = new ModelRenderer(this, 95, 2);
        leftarm1.addBox(0F, 0F, 14F, 2, 12, 1);
        leftarm1.setRotationPoint(7F, -4F, 0F);
        leftarm1.setTextureSize(128, 32);
        leftarm1.mirror = true;
        setRotation(leftarm1, -1.22173F, 0F, -2.268928F);
        rightarm1 = new ModelRenderer(this, 95, 2);
        rightarm1.addBox(-2F, 0F, 14F, 2, 12, 1);
        rightarm1.setRotationPoint(-7F, -4F, 0F);
        rightarm1.setTextureSize(128, 32);
        rightarm1.mirror = true;
        setRotation(rightarm1, -1.22173F, 0F, 2.268928F);
        leftarm2 = new ModelRenderer(this, 110, 5);
        leftarm2.addBox(0F, -2F, -3F, 2, 12, 1);
        leftarm2.setRotationPoint(7F, -4F, 0F);
        leftarm2.setTextureSize(128, 32);
        leftarm2.mirror = true;
        setRotation(leftarm2, 0F, 0F, -2.268928F);
        leftarm3 = new ModelRenderer(this, 119, 10);
        leftarm3.addBox(-2F, 4F, -1F, 1, 7, 2);
        leftarm3.setRotationPoint(7F, -4F, 0F);
        leftarm3.setTextureSize(128, 32);
        leftarm3.mirror = true;
        setRotation(leftarm3, 0F, 0F, -2.268928F);
        leftarm4 = new ModelRenderer(this, 95, 2);
        leftarm4.addBox(0F, -2F, 2F, 2, 12, 1);
        leftarm4.setRotationPoint(7F, -4F, 0F);
        leftarm4.setTextureSize(128, 32);
        leftarm4.mirror = true;
        setRotation(leftarm4, 0F, 0F, -2.268928F);
        rightarm2 = new ModelRenderer(this, 110, 5);
        rightarm2.addBox(-2F, -2F, -3F, 2, 12, 1);
        rightarm2.setRotationPoint(-7F, -4F, 0F);
        rightarm2.setTextureSize(128, 32);
        rightarm2.mirror = true;
        setRotation(rightarm2, 0F, 0F, 2.268928F);
        rightarm3 = new ModelRenderer(this, 121, 10);
        rightarm3.addBox(1F, 6F, -1F, 1, 7, 2);
        rightarm3.setRotationPoint(-7F, -4F, 0F);
        rightarm3.setTextureSize(128, 32);
        rightarm3.mirror = true;
        setRotation(rightarm3, 0F, 0F, 2.268928F);
        rightarm4 = new ModelRenderer(this, 95, 2);
        rightarm4.addBox(-2F, -2F, 2F, 2, 12, 1);
        rightarm4.setRotationPoint(-7F, -4F, 0F);
        rightarm4.setTextureSize(128, 32);
        rightarm4.mirror = true;
        setRotation(rightarm4, 0F, 0F, 2.268928F);
        rightarm5 = new ModelRenderer(this, 86, 16);
        rightarm5.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm5.setRotationPoint(-7F, -4F, 0F);
        rightarm5.setTextureSize(128, 32);
        rightarm5.mirror = true;
        setRotation(rightarm5, 0F, 0F, 2.268928F);
        leftarm5 = new ModelRenderer(this, 86, 16);
        leftarm5.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm5.setRotationPoint(7F, -4F, 0F);
        leftarm5.setTextureSize(128, 32);
        leftarm5.mirror = true;
        setRotation(leftarm5, 0F, 0F, -2.268928F);
        rightarm6 = new ModelRenderer(this, 121, 10);
        rightarm6.addBox(-4F, 6F, -1F, 1, 7, 2);
        rightarm6.setRotationPoint(-7F, -4F, 0F);
        rightarm6.setTextureSize(128, 32);
        rightarm6.mirror = true;
        setRotation(rightarm6, 0F, 0F, 2.268928F);
        leftarm6 = new ModelRenderer(this, 119, 10);
        leftarm6.addBox(3F, 4F, -1F, 1, 7, 2);
        leftarm6.setRotationPoint(7F, -4F, 0F);
        leftarm6.setTextureSize(128, 32);
        leftarm6.mirror = true;
        setRotation(leftarm6, 0F, 0F, -2.268928F);
        rightarm7 = new ModelRenderer(this, 103, 20);
        rightarm7.addBox(-4F, 12F, 9F, 6, 6, 6);
        rightarm7.setRotationPoint(-7F, -4F, 0F);
        rightarm7.setTextureSize(128, 32);
        rightarm7.mirror = true;
        setRotation(rightarm7, -1.22173F, 0F, 2.268928F);
        rightarm8 = new ModelRenderer(this, 86, 16);
        rightarm8.addBox(-3F, 0F, 10F, 4, 12, 4);
        rightarm8.setRotationPoint(-7F, -4F, 0F);
        rightarm8.setTextureSize(128, 32);
        rightarm8.mirror = true;
        setRotation(rightarm8, -1.22173F, 0F, 2.268928F);
        rightarm9 = new ModelRenderer(this, 110, 5);
        rightarm9.addBox(-2F, 0F, 9F, 2, 12, 1);
        rightarm9.setRotationPoint(-7F, -4F, 0F);
        rightarm9.setTextureSize(128, 32);
        rightarm9.mirror = true;
        setRotation(rightarm9, -1.22173F, 0F, 2.268928F);
        leftarm7 = new ModelRenderer(this, 103, 20);
        leftarm7.addBox(-2F, 12F, 9F, 6, 6, 6);
        leftarm7.setRotationPoint(7F, -4F, 0F);
        leftarm7.setTextureSize(128, 32);
        leftarm7.mirror = true;
        setRotation(leftarm7, -1.22173F, 0F, -2.268928F);
        leftarm8 = new ModelRenderer(this, 86, 16);
        leftarm8.addBox(-1F, 0F, 10F, 4, 12, 4);
        leftarm8.setRotationPoint(7F, -4F, 0F);
        leftarm8.setTextureSize(128, 32);
        leftarm8.mirror = true;
        setRotation(leftarm8, -1.22173F, 0F, -2.268928F);
        leftarm9 = new ModelRenderer(this, 110, 5);
        leftarm9.addBox(0F, 0F, 9F, 2, 12, 1);
        leftarm9.setRotationPoint(7F, -4F, 0F);
        leftarm9.setTextureSize(128, 32);
        leftarm9.mirror = true;
        setRotation(leftarm9, -1.22173F, 0F, -2.268928F);
        rightarm10 = new ModelRenderer(this, 103, 20);
        rightarm10.addBox(-4F, 12F, 9F, 6, 6, 6);
        rightarm10.setRotationPoint(-7F, 2F, 0F);
        rightarm10.setTextureSize(128, 32);
        rightarm10.mirror = true;
        setRotation(rightarm10, -1.22173F, 0F, 0.5235988F);
        rightarm11 = new ModelRenderer(this, 86, 16);
        rightarm11.addBox(-3F, 0F, 10F, 4, 12, 4);
        rightarm11.setRotationPoint(-7F, 2F, 0F);
        rightarm11.setTextureSize(128, 32);
        rightarm11.mirror = true;
        setRotation(rightarm11, -1.22173F, 0F, 0.5235988F);
        rightarm12 = new ModelRenderer(this, 121, 10);
        rightarm12.addBox(1F, 6F, -1F, 1, 7, 2);
        rightarm12.setRotationPoint(-7F, 2F, 0F);
        rightarm12.setTextureSize(128, 32);
        rightarm12.mirror = true;
        setRotation(rightarm12, 0F, 0F, 0.5235988F);
        rightarm13 = new ModelRenderer(this, 110, 5);
        rightarm13.addBox(-2F, 0F, 9F, 2, 12, 1);
        rightarm13.setRotationPoint(-7F, 2F, 0F);
        rightarm13.setTextureSize(128, 32);
        rightarm13.mirror = true;
        setRotation(rightarm13, -1.22173F, 0F, 0.5235988F);
        rightarm14 = new ModelRenderer(this, 110, 5);
        rightarm14.addBox(-2F, -2F, -3F, 2, 12, 1);
        rightarm14.setRotationPoint(-7F, 2F, 0F);
        rightarm14.setTextureSize(128, 32);
        rightarm14.mirror = true;
        setRotation(rightarm14, 0F, 0F, 0.5235988F);
        rightarm15 = new ModelRenderer(this, 121, 10);
        rightarm15.addBox(-4F, 6F, -1F, 1, 7, 2);
        rightarm15.setRotationPoint(-7F, 2F, 0F);
        rightarm15.setTextureSize(128, 32);
        rightarm15.mirror = true;
        setRotation(rightarm15, 0F, 0F, 0.5235988F);
        rightarm16 = new ModelRenderer(this, 86, 16);
        rightarm16.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm16.setRotationPoint(-7F, 2F, 0F);
        rightarm16.setTextureSize(128, 32);
        rightarm16.mirror = true;
        setRotation(rightarm16, 0F, 0F, 0.5235988F);
        rightarm17 = new ModelRenderer(this, 95, 2);
        rightarm17.addBox(-2F, 0F, 14F, 2, 12, 1);
        rightarm17.setRotationPoint(-7F, 2F, 0F);
        rightarm17.setTextureSize(128, 32);
        rightarm17.mirror = true;
        setRotation(rightarm17, -1.22173F, 0F, 0.5235988F);
        rightarm18 = new ModelRenderer(this, 95, 2);
        rightarm18.addBox(-2F, -2F, 2F, 2, 12, 1);
        rightarm18.setRotationPoint(-7F, 2F, 0F);
        rightarm18.setTextureSize(128, 32);
        rightarm18.mirror = true;
        setRotation(rightarm18, 0F, 0F, 0.5235988F);
        leftarm10 = new ModelRenderer(this, 103, 20);
        leftarm10.addBox(-2F, 12F, 9F, 6, 6, 6);
        leftarm10.setRotationPoint(7F, 2F, 0F);
        leftarm10.setTextureSize(128, 32);
        leftarm10.mirror = true;
        setRotation(leftarm10, -1.22173F, 0F, -0.5235988F);
        leftarm11 = new ModelRenderer(this, 110, 5);
        leftarm11.addBox(0F, 0F, 9F, 2, 12, 1);
        leftarm11.setRotationPoint(7F, 2F, 0F);
        leftarm11.setTextureSize(128, 32);
        leftarm11.mirror = true;
        setRotation(leftarm11, -1.22173F, 0F, -0.5235988F);
        leftarm12 = new ModelRenderer(this, 86, 16);
        leftarm12.addBox(-1F, 0F, 10F, 4, 12, 4);
        leftarm12.setRotationPoint(7F, 2F, 0F);
        leftarm12.setTextureSize(128, 32);
        leftarm12.mirror = true;
        setRotation(leftarm12, -1.22173F, 0F, -0.5235988F);
        leftarm13 = new ModelRenderer(this, 110, 5);
        leftarm13.addBox(0F, -2F, -3F, 2, 12, 1);
        leftarm13.setRotationPoint(7F, 2F, 0F);
        leftarm13.setTextureSize(128, 32);
        leftarm13.mirror = true;
        setRotation(leftarm13, 0F, 0F, -0.5235988F);
        leftarm14 = new ModelRenderer(this, 87, 16);
        leftarm14.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm14.setRotationPoint(7F, 2F, 0F);
        leftarm14.setTextureSize(128, 32);
        leftarm14.mirror = true;
        setRotation(leftarm14, 0F, 0F, -0.5235988F);
        leftarm15 = new ModelRenderer(this, 119, 10);
        leftarm15.addBox(3F, 4F, -1F, 1, 7, 2);
        leftarm15.setRotationPoint(7F, 2F, 0F);
        leftarm15.setTextureSize(128, 32);
        leftarm15.mirror = true;
        setRotation(leftarm15, 0F, 0F, -0.5235988F);
        leftarm16 = new ModelRenderer(this, 119, 10);
        leftarm16.addBox(-2F, 4F, -1F, 1, 7, 2);
        leftarm16.setRotationPoint(7F, 2F, 0F);
        leftarm16.setTextureSize(128, 32);
        leftarm16.mirror = true;
        setRotation(leftarm16, 0F, 0F, -0.5235988F);
        leftarm17 = new ModelRenderer(this, 95, 2);
        leftarm17.addBox(0F, -2F, 2F, 2, 12, 1);
        leftarm17.setRotationPoint(7F, 2F, 0F);
        leftarm17.setTextureSize(128, 32);
        leftarm17.mirror = true;
        setRotation(leftarm17, 0F, 0F, -0.5235988F);
        leftarm18 = new ModelRenderer(this, 95, 2);
        leftarm18.addBox(0F, 0F, 14F, 2, 12, 1);
        leftarm18.setRotationPoint(7F, 2F, 0F);
        leftarm18.setTextureSize(128, 32);
        leftarm18.mirror = true;
        setRotation(leftarm18, -1.22173F, 0F, -0.5235988F);
        rightarm19 = new ModelRenderer(this, 103, 20);
        rightarm19.addBox(-4F, 12F, 9F, 6, 6, 6);
        rightarm19.setRotationPoint(-7F, -1F, 0F);
        rightarm19.setTextureSize(128, 32);
        rightarm19.mirror = true;
        setRotation(rightarm19, -1.22173F, 0F, 1.396263F);
        rightarm20 = new ModelRenderer(this, 110, 5);
        rightarm20.addBox(-2F, 0F, 9F, 2, 12, 1);
        rightarm20.setRotationPoint(-7F, -1F, 0F);
        rightarm20.setTextureSize(128, 32);
        rightarm20.mirror = true;
        setRotation(rightarm20, -1.22173F, 0F, 1.396263F);
        rightarm21 = new ModelRenderer(this, 86, 16);
        rightarm21.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm21.setRotationPoint(-7F, -1F, 0F);
        rightarm21.setTextureSize(128, 32);
        rightarm21.mirror = true;
        setRotation(rightarm21, 0F, 0F, 1.396263F);
        rightarm22 = new ModelRenderer(this, 86, 16);
        rightarm22.addBox(-3F, 0F, 10F, 4, 12, 4);
        rightarm22.setRotationPoint(-7F, -1F, 0F);
        rightarm22.setTextureSize(128, 32);
        rightarm22.mirror = true;
        setRotation(rightarm22, -1.22173F, 0F, 1.396263F);
        rightarm23 = new ModelRenderer(this, 121, 10);
        rightarm23.addBox(-4F, 6F, -1F, 1, 7, 2);
        rightarm23.setRotationPoint(-7F, -1F, 0F);
        rightarm23.setTextureSize(128, 32);
        rightarm23.mirror = true;
        setRotation(rightarm23, 0F, 0F, 1.396263F);
        rightarm24 = new ModelRenderer(this, 110, 5);
        rightarm24.addBox(-2F, -2F, -3F, 2, 12, 1);
        rightarm24.setRotationPoint(-7F, -1F, 0F);
        rightarm24.setTextureSize(128, 32);
        rightarm24.mirror = true;
        setRotation(rightarm24, 0F, 0F, 1.396263F);
        rightarm25 = new ModelRenderer(this, 121, 10);
        rightarm25.addBox(1F, 6F, -1F, 1, 7, 2);
        rightarm25.setRotationPoint(-7F, -1F, 0F);
        rightarm25.setTextureSize(128, 32);
        rightarm25.mirror = true;
        setRotation(rightarm25, 0F, 0F, 1.396263F);
        rightarm26 = new ModelRenderer(this, 95, 2);
        rightarm26.addBox(-2F, -2F, 2F, 2, 12, 1);
        rightarm26.setRotationPoint(-7F, -1F, 0F);
        rightarm26.setTextureSize(128, 32);
        rightarm26.mirror = true;
        setRotation(rightarm26, 0F, 0F, 1.396263F);
        leftarm19 = new ModelRenderer(this, 103, 20);
        leftarm19.addBox(-2F, 12F, 9F, 6, 6, 6);
        leftarm19.setRotationPoint(7F, -1F, 0F);
        leftarm19.setTextureSize(128, 32);
        leftarm19.mirror = true;
        setRotation(leftarm19, -1.22173F, 0F, -1.396263F);
        leftarm20 = new ModelRenderer(this, 86, 16);
        leftarm20.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm20.setRotationPoint(7F, -1F, 0F);
        leftarm20.setTextureSize(128, 32);
        leftarm20.mirror = true;
        setRotation(leftarm20, 0F, 0F, -1.396263F);
        leftarm22 = new ModelRenderer(this, 119, 10);
        leftarm22.addBox(3F, 4F, -1F, 1, 7, 2);
        leftarm22.setRotationPoint(7F, -1F, 0F);
        leftarm22.setTextureSize(128, 32);
        leftarm22.mirror = true;
        setRotation(leftarm22, 0F, 0F, -1.396263F);
        leftarm21 = new ModelRenderer(this, 86, 16);
        leftarm21.addBox(-1F, 0F, 10F, 4, 12, 4);
        leftarm21.setRotationPoint(7F, -1F, 0F);
        leftarm21.setTextureSize(128, 32);
        leftarm21.mirror = true;
        setRotation(leftarm21, -1.22173F, 0F, -1.396263F);
        leftarm23 = new ModelRenderer(this, 95, 2);
        leftarm23.addBox(0F, 0F, 14F, 2, 12, 1);
        leftarm23.setRotationPoint(7F, -1F, 0F);
        leftarm23.setTextureSize(128, 32);
        leftarm23.mirror = true;
        setRotation(leftarm23, -1.22173F, 0F, -1.396263F);
        leftarm24 = new ModelRenderer(this, 110, 5);
        leftarm24.addBox(0F, 0F, 9F, 2, 12, 1);
        leftarm24.setRotationPoint(7F, -1F, 0F);
        leftarm24.setTextureSize(128, 32);
        leftarm24.mirror = true;
        setRotation(leftarm24, -1.22173F, 0F, -1.396263F);
        leftarm25 = new ModelRenderer(this, 95, 2);
        leftarm25.addBox(0F, -2F, 2F, 2, 12, 1);
        leftarm25.setRotationPoint(7F, -1F, 0F);
        leftarm25.setTextureSize(128, 32);
        leftarm25.mirror = true;
        setRotation(leftarm25, 0F, 0F, -1.396263F);
        leftarm26 = new ModelRenderer(this, 119, 10);
        leftarm26.addBox(-2F, 4F, -1F, 1, 7, 2);
        leftarm26.setRotationPoint(7F, -1F, 0F);
        leftarm26.setTextureSize(128, 32);
        leftarm26.mirror = true;
        setRotation(leftarm26, 0F, 0F, -1.396263F);
        body2 = new ModelRenderer(this, 72, 2);
        body2.addBox(-4F, 0F, -2F, 5, 2, 3);
        body2.setRotationPoint(4F, 5F, 2F);
        body2.setTextureSize(128, 32);
        body2.mirror = true;
        setRotation(body2, 0F, 0F, 0F);
        body3 = new ModelRenderer(this, 60, 21);
        body3.addBox(-4F, 0F, -2F, 8, 6, 4);
        body3.setRotationPoint(-4F, -6F, 2F);
        body3.setTextureSize(128, 32);
        body3.mirror = true;
        setRotation(body3, 0F, 0F, 0F);
        body4 = new ModelRenderer(this, 16, 16);
        body4.addBox(-4F, 0F, -2F, 4, 6, 4);
        body4.setRotationPoint(2F, -9F, 0F);
        body4.setTextureSize(128, 32);
        body4.mirror = true;
        setRotation(body4, 0F, 0F, 0F);
        body5 = new ModelRenderer(this, 60, 21);
        body5.addBox(-4F, 0F, -2F, 8, 6, 4);
        body5.setRotationPoint(-4F, -6F, -2F);
        body5.setTextureSize(128, 32);
        body5.mirror = true;
        setRotation(body5, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-4F, 12F, 0F);
        rightleg.setTextureSize(128, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(4F, 12F, 0F);
        leftleg.setTextureSize(128, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        body6 = new ModelRenderer(this, 16, 16);
        body6.addBox(-4F, 0F, -2F, 8, 12, 4);
        body6.setRotationPoint(0F, 0F, 0F);
        body6.setTextureSize(128, 32);
        body6.mirror = true;
        setRotation(body6, 0F, 0F, 0F);
        body7 = new ModelRenderer(this, 72, 2);
        body7.addBox(-4F, 0F, -2F, 5, 2, 3);
        body7.setRotationPoint(-1F, 5F, 2F);
        body7.setTextureSize(128, 32);
        body7.mirror = true;
        setRotation(body7, 0F, 0F, 0F);
        body8 = new ModelRenderer(this, 72, 2);
        body8.addBox(-4F, 0F, -2F, 5, 2, 3);
        body8.setRotationPoint(4F, 5F, -1F);
        body8.setTextureSize(128, 32);
        body8.mirror = true;
        setRotation(body8, 0F, 0F, 0F);
        body9 = new ModelRenderer(this, 72, 2);
        body9.addBox(-4F, 0F, -2F, 5, 2, 3);
        body9.setRotationPoint(-1F, 5F, -1F);
        body9.setTextureSize(128, 32);
        body9.mirror = true;
        setRotation(body9, 0F, 0F, 0F);
        body10 = new ModelRenderer(this, 72, 2);
        body10.addBox(-4F, 0F, -2F, 5, 2, 3);
        body10.setRotationPoint(4F, 1F, 2F);
        body10.setTextureSize(128, 32);
        body10.mirror = true;
        setRotation(body10, 0F, 0F, 0F);
        body11 = new ModelRenderer(this, 72, 2);
        body11.addBox(-4F, 0F, -2F, 5, 2, 3);
        body11.setRotationPoint(-1F, 1F, 2F);
        body11.setTextureSize(128, 32);
        body11.mirror = true;
        setRotation(body11, 0F, 0F, 0F);
        body12 = new ModelRenderer(this, 72, 2);
        body12.addBox(-4F, 0F, -2F, 5, 2, 3);
        body12.setRotationPoint(-1F, 1F, -1F);
        body12.setTextureSize(128, 32);
        body12.mirror = true;
        setRotation(body12, 0F, 0F, 0F);
        body13 = new ModelRenderer(this, 72, 2);
        body13.addBox(-4F, 0F, -2F, 5, 2, 3);
        body13.setRotationPoint(4F, 1F, -1F);
        body13.setTextureSize(128, 32);
        body13.mirror = true;
        setRotation(body13, 0F, 0F, 0F);
        body14 = new ModelRenderer(this, 60, 21);
        body14.addBox(-4F, 0F, -2F, 8, 6, 4);
        body14.setRotationPoint(4F, -6F, -2F);
        body14.setTextureSize(128, 32);
        body14.mirror = true;
        setRotation(body14, 0F, 0F, 0F);
        head = new ModelRenderer(this, 38, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, -8F, 0F);
        head.setTextureSize(128, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        horn2 = new ModelRenderer(this, 6, 0);
        horn2.addBox(0F, -15F, -3F, 2, 13, 2);
        horn2.setRotationPoint(0F, -8F, 0F);
        horn2.setTextureSize(128, 32);
        horn2.mirror = true;
        setRotation(horn2, 0F, 0F, 0.6108652F);
        horn3 = new ModelRenderer(this, 6, 0);
        horn3.addBox(-2F, -15F, 1F, 2, 13, 2);
        horn3.setRotationPoint(0F, -8F, 0F);
        horn3.setTextureSize(128, 32);
        horn3.mirror = true;
        setRotation(horn3, 0F, 0F, -0.6108652F);
        horn4 = new ModelRenderer(this, 6, 0);
        horn4.addBox(-2F, -15F, -3F, 2, 13, 2);
        horn4.setRotationPoint(0F, -8F, 0F);
        horn4.setTextureSize(128, 32);
        horn4.mirror = true;
        setRotation(horn4, 0F, 0F, -0.6108652F);
        leftarm27 = new ModelRenderer(this, 110, 5);
        leftarm27.addBox(0F, -2F, -3F, 2, 12, 1);
        leftarm27.setRotationPoint(7F, -1F, 0F);
        leftarm27.setTextureSize(128, 32);
        leftarm27.mirror = true;
        setRotation(leftarm27, 0F, 0F, -1.396263F);
        rightarm27 = new ModelRenderer(this, 95, 2);
        rightarm27.addBox(-2F, 0F, 14F, 2, 12, 1);
        rightarm27.setRotationPoint(-7F, -1F, 0F);
        rightarm27.setTextureSize(128, 32);
        rightarm27.mirror = true;
        setRotation(rightarm27, -1.22173F, 0F, 1.396263F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        horn1.render(f5);
        body1.render(f5);
        rightleg1.render(f5);
        leftleg1.render(f5);
        rightleg2.render(f5);
        leftleg2.render(f5);
        rightleg3.render(f5);
        leftleg3.render(f5);
        rightleg4.render(f5);
        rightleg5.render(f5);
        leftleg4.render(f5);
        leftleg5.render(f5);
        leftarm1.render(f5);
        rightarm1.render(f5);
        leftarm2.render(f5);
        leftarm3.render(f5);
        leftarm4.render(f5);
        rightarm2.render(f5);
        rightarm3.render(f5);
        rightarm4.render(f5);
        rightarm5.render(f5);
        leftarm5.render(f5);
        rightarm6.render(f5);
        leftarm6.render(f5);
        rightarm7.render(f5);
        rightarm8.render(f5);
        rightarm9.render(f5);
        leftarm7.render(f5);
        leftarm8.render(f5);
        leftarm9.render(f5);
        rightarm10.render(f5);
        rightarm11.render(f5);
        rightarm12.render(f5);
        rightarm13.render(f5);
        rightarm14.render(f5);
        rightarm15.render(f5);
        rightarm16.render(f5);
        rightarm17.render(f5);
        rightarm18.render(f5);
        leftarm10.render(f5);
        leftarm11.render(f5);
        leftarm12.render(f5);
        leftarm13.render(f5);
        leftarm14.render(f5);
        leftarm15.render(f5);
        leftarm16.render(f5);
        leftarm17.render(f5);
        leftarm18.render(f5);
        rightarm19.render(f5);
        rightarm20.render(f5);
        rightarm21.render(f5);
        rightarm22.render(f5);
        rightarm23.render(f5);
        rightarm24.render(f5);
        rightarm25.render(f5);
        rightarm26.render(f5);
        leftarm19.render(f5);
        leftarm20.render(f5);
        leftarm22.render(f5);
        leftarm21.render(f5);
        leftarm23.render(f5);
        leftarm24.render(f5);
        leftarm25.render(f5);
        leftarm26.render(f5);
        body2.render(f5);
        body3.render(f5);
        body4.render(f5);
        body5.render(f5);
        rightleg.render(f5);
        leftleg.render(f5);
        body6.render(f5);
        body7.render(f5);
        body8.render(f5);
        body9.render(f5);
        body10.render(f5);
        body11.render(f5);
        body12.render(f5);
        body13.render(f5);
        body14.render(f5);
        head.render(f5);
        horn2.render(f5);
        horn3.render(f5);
        horn4.render(f5);
        leftarm27.render(f5);
        rightarm27.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.leftleg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftleg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftleg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftleg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftleg5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

        this.rightleg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;

        this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm9.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm10.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm11.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm12.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm13.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm14.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm15.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm16.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm17.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm18.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm19.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm20.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm21.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm22.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;
        this.rightarm23.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm24.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm25.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm26.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm27.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F - 1.22173F;

        this.leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm7.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm8.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm9.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm10.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm11.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm12.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm13.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm14.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm15.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm16.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm17.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm18.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm19.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm20.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm21.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm22.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm23.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm24.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F - 1.22173F;
        this.leftarm25.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm26.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm27.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    }

}
