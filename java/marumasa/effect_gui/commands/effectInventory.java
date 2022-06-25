package marumasa.effect_gui.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class effectInventory {
    public effectInventory() {
    }

    public Inventory setMain() {

        Inventory inventory = Bukkit.createInventory(null, 54, "EffectMenu");

        List<String> NameList = new ArrayList<>();
        List<String> LoreList = new ArrayList<>();

        List<Color> PotionColorList = new ArrayList<>();
        List<Boolean> isGood = new ArrayList<>();

        //-----ここからエフェクトの名前と説明の設定-----//

        NameList.add("移動速度上昇");
        LoreList.add("移動速度が上昇する");
        PotionColorList.add(Color.fromBGR(202, 178, 126));
        isGood.add(true);

        NameList.add("移動速度低下");
        LoreList.add("移動速度が低下する");
        PotionColorList.add(Color.fromBGR(131, 110, 92));
        isGood.add(false);

        NameList.add("採掘速度上昇");
        LoreList.add("採掘速度と攻撃速度が上昇する");
        PotionColorList.add(Color.fromBGR(67, 192, 217));
        isGood.add(true);

        NameList.add("採掘速度低下");
        LoreList.add("採掘速度と攻撃速度が低下する");
        PotionColorList.add(Color.fromBGR(23, 66, 74));
        isGood.add(false);

        NameList.add("攻撃力上昇");
        LoreList.add("近接攻撃の威力が上昇する");
        PotionColorList.add(Color.fromBGR(36, 37, 150));
        isGood.add(true);

        NameList.add("即時回復");
        LoreList.add("エンティティを回復し、アンデッドにはダメージを与える");
        PotionColorList.add(Color.fromBGR(36, 37, 252));
        isGood.add(true);

        NameList.add("即時ダメージ");
        LoreList.add("エンティティにダメージを与え、アンデッドは回復する");
        PotionColorList.add(Color.fromBGR(9, 10, 68));
        isGood.add(false);

        NameList.add("跳躍力上昇");
        LoreList.add("ジャンプの高さが上昇し落下ダメージが減少する");
        PotionColorList.add(Color.fromBGR(77, 252, 35));
        isGood.add(true);

        NameList.add("吐き気");
        LoreList.add("画面がぐらぐらとゆがむ");
        PotionColorList.add(Color.fromBGR(74, 29, 85));
        isGood.add(false);

        NameList.add("再生能力");
        LoreList.add("時間とともに体力が回復する");
        PotionColorList.add(Color.fromBGR(174, 94, 209));
        isGood.add(true);

        NameList.add("耐性");
        LoreList.add("ほとんどのダメージが減少する");
        PotionColorList.add(Color.fromBGR(58, 69, 153));
        isGood.add(true);

        NameList.add("火炎耐性");
        LoreList.add("炎などに耐性を得る");
        PotionColorList.add(Color.fromBGR(59, 157, 232));
        isGood.add(true);

        NameList.add("水中呼吸");
        LoreList.add("溺れなくなる");
        PotionColorList.add(Color.fromBGR(156, 84, 47));
        isGood.add(true);

        NameList.add("透明化");
        LoreList.add("透明になる");
        PotionColorList.add(Color.fromBGR(149, 133, 129));
        isGood.add(true);

        NameList.add("盲目");
        LoreList.add("視界が黒い霧に包まれ、ダッシュやクリティカルヒットができなくなる");
        PotionColorList.add(Color.fromBGR(35, 31, 31));
        isGood.add(false);

        NameList.add("暗視");
        LoreList.add("暗闇でも明るく見えるようになる");
        PotionColorList.add(Color.fromBGR(164, 32, 32));
        isGood.add(true);

        NameList.add("空腹");
        LoreList.add("満腹度消耗値が上昇する");
        PotionColorList.add(Color.fromBGR(83, 118, 88));
        isGood.add(false);

        NameList.add("弱体化");
        LoreList.add("近接攻撃の威力が低下する");
        PotionColorList.add(Color.fromBGR(73, 78, 73));
        isGood.add(false);

        NameList.add("毒");
        LoreList.add("時間とともにダメージを受ける（ただし死なない）");
        PotionColorList.add(Color.fromBGR(50, 150, 79));
        isGood.add(false);

        NameList.add("衰弱");
        LoreList.add("時間とともにダメージを受ける（死に至る）");
        PotionColorList.add(Color.fromBGR(39, 42, 53));
        isGood.add(false);

        NameList.add("体力増強");
        LoreList.add("体力の最大値が増加する");
        PotionColorList.add(Color.fromBGR(35, 125, 248));
        isGood.add(true);

        NameList.add("衝撃吸収");
        LoreList.add("使い捨ての体力が一時的に増加する");
        PotionColorList.add(Color.fromBGR(165, 82, 37));
        isGood.add(true);

        NameList.add("満腹度回復");
        LoreList.add("満腹値と隠し満腹値が上昇する");
        PotionColorList.add(Color.fromBGR(35, 36, 248));
        isGood.add(true);

        NameList.add("発光");
        LoreList.add("エンティティが縁取られ、ブロックを通り越して視認できる");
        PotionColorList.add(Color.fromBGR(97, 160, 148));
        isGood.add(false);

        NameList.add("浮遊");
        LoreList.add("エンティティが浮かび上がる");
        PotionColorList.add(Color.fromBGR(255, 255, 206));
        isGood.add(false);

        NameList.add("幸運");
        LoreList.add("釣りでレアなお宝が出現しやすくなる");
        PotionColorList.add(Color.fromBGR(0, 156, 52));
        isGood.add(true);

        NameList.add("不運");
        LoreList.add("釣りでレアなお宝が出現しにくくなる");
        PotionColorList.add(Color.fromBGR(77, 164, 192));
        isGood.add(false);

        NameList.add("落下速度低下");
        LoreList.add("落下速度を低下させ、落下ダメージを無効化する");
        PotionColorList.add(Color.fromBGR(224, 248, 247));
        isGood.add(true);

        NameList.add("コンジットパワー");
        LoreList.add("水中での暗視効果、採掘速度の上昇効果を与え、溺れなくなる");
        PotionColorList.add(Color.fromBGR(209, 194, 29));
        isGood.add(true);

        NameList.add("イルカの好意");
        LoreList.add("泳ぐ速度が上昇する");
        PotionColorList.add(Color.fromBGR(190, 163, 136));
        isGood.add(true);

        NameList.add("不吉な予感");
        LoreList.add("村に入ると襲撃が開始される");
        PotionColorList.add(Color.fromBGR(56, 97, 11));
        isGood.add(false);

        NameList.add("村の英雄");
        LoreList.add("村人の交易が値引きされる");
        PotionColorList.add(Color.fromBGR(68, 255, 68));
        isGood.add(true);

        //-----ここから上に書いた名前と設定の登録処理-----//

        for (int loop = 0; loop < NameList.size(); loop++) {
            ItemMeta itemMeta = new ItemStack(Material.POTION).getItemMeta();
            PotionMeta meta = (PotionMeta) itemMeta;

            meta.setColor(PotionColorList.get(loop));

            itemMeta.setDisplayName("§a" + "エフェクト: " + NameList.get(loop));

            List<String> lore = new ArrayList<>();

            lore.add("§a" + LoreList.get(loop));
            if (isGood.get(loop)) {
                lore.add("§9" + "プラス効果");
            } else {
                lore.add("§c" + "マイナス効果");
            }

            itemMeta.setLore(lore);
            itemMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);

            inventory.setItem(loop, new ItemStack(Material.POTION, 1));
            inventory.getItem(loop).setItemMeta(itemMeta);
        }



        inventory = new settingInventory(inventory).setMain();




        ItemMeta itemMeta = new ItemStack(Material.MILK_BUCKET).getItemMeta();
        itemMeta.setDisplayName("§a" + "リセット");
        itemMeta.setLore(Collections.singletonList("§a" + "エフェクトをリセットする"));
        inventory.setItem(49, new ItemStack(Material.MILK_BUCKET, 1));
        inventory.getItem(49).setItemMeta(itemMeta);//リセット

        return inventory;
    }
}