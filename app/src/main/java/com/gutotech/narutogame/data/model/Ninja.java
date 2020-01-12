package com.gutotech.narutogame.data.model;

public enum Ninja {
    NARUTO(1, "Naruto Uzumaki"),
    SASUKE(2, "Sasuke Uchiha"),
    ROCK_LEE(3, "Rock Lee"),
    GAARA(4, "Sabaku no Gaara"),
    SAKURA(42, "Sakura Haruno"),
    ZABUZA(43, "Zabuza Momochi"),
    HAKU(44, "Haku"),
    KANKURO(46, "Kankurou"),
    TEMARI(47, "Temari"),
    SUZUMEBACHI(50, "Suzumebachi Kamizuru"),
    YUGITO(51, "Yugito Nii"),
    DEIDARA(52, "Deidara"),
    AKASUNA_SASORI(53, "Akasuna no Sasori"),
    KISAME(54, "Kisame Hoshigaki"),
    ITACHI(55, "Itachi Uchiha"),
    TENTEN(56, "Tenten"),
    NEJI(57, "Neji Hyuuga"),
    SHINO(58, "Shino Aburame"),
    INO(59, "Ino Yamanaka"),
    KAKASHI(60, "Kakashi Hataki"),
    GAI(61, "Maito Gai"),
    SHIKAMARU(62, "Shikamaru Nara"),
    JIRAIYA(63, "Jiraiya"),
    ZAKU(64, "Zaku Abumi"),
    BAKI(65, "Baki"),
    EBISU(66, "Ebisu"),
    HAYATE(67, "Hayate Gekkou"),
    HINATA(69, "Hinata Hyuuga"),
    JIROUBOU(70, "Jiroubou"),
    KIMIMARO(71, "Kimimaro Kaguya"),
    KIDOMARU(72, "Kidoumaru"),
    KONOHAMARU(73, "Konohamaru Sarutobi"),
    DOSU(74, "Dosu Kinuta"),
    TOBIRAMA(75, "Tobirama Senju"),
    OROCHIMARU(76, "Orochimaru"),
    SAKON_UKON(77, "Sakon e Ukon"),
    HASHIRAMA(78, "Hashirama Senju"),
    ASUMA(79, "Asuma Sarutobi"),
    GENMA(80, "Genma Shiranui"),
    SHIZUNE(81, "Shizune"),
    MINATO(84, "Minato Namikaze"),
    ZETSU(85, "Zetsu"),
    IBIKI(86, "Ibiki Morino"),
    ANKO(87, "Anko Mitarashi"),
    TAYUYA(88, "Tayuya"),
    TSUCHI(89, "Tsuchi Kin"),
    OBITO(90, "Obito Uchiha"),
    KURENAI(91, "Kurenai Yuuhi"),
    CHOUJI(94, "Chouji Akimichi"),
    KIBA(95, "Kiba Inuzuka"),
    IRUKA(98, "Iruka Umino"),
    SAY(99, "Sai"),
    YAMATO(100, "Yamato"),
    KABUTO(101, "Kabuto Yakushi"),
    TSUNADE(102, "Tsunade Senju"),
    PEIN(103, "Pein Tendo"),
    TOBI(104, "Tobi"),
    HIDAN(105, "Hidan"),
    KAZUZU(109, "Kakuzu"),
    SARUTOBI(110, "Hiruzen Sarutobi"),
    SORA(111, "Sora"),
    RIN(112, "Rin Nohara"),
    KONAN(113, "Konan"),
    GUREN(115, "Guren"),
    JUUGO(116, "Juugo"),
    KARIN(117, "Karin Uzumaki"),
    SUIGETSU(118, "Suigetsu Hoozuki"),
    KILLER_BEE(119, "Killer Bee"),
    CHIYOU(120, "Chiyo"),
    KAKASHI_JOVEM(121, "Kakashi Jovem"),
    MADARA(122, "Madara Uchiha"),
    CHOUZA(123, "Chouza Akimichi"),
    EI(125, "Ei"),
    KUSHINA(126, "Kushina Uzumaki"),
    SAKUMO(127, "Sakumo Hatake"),
    DANZOU(129, "Danzou Shimura"),
    HANABI(131, "Hanabi Hyuuga"),
    HIASHI(132, "Hiashi Hyuuga"),
    INOICHI(136, "Inoichi Yamanaka"),
    NAGATO(137, "Nagato Uzumaki"),
    YAHIKO(138, "Yahiko"),
    SHIKAKU(139, "Shikaku Nara"),
    MEI(140, "Mei Terumii"),
    OONOKI(141, "Oonoki"),
    YAGURA(142, "Yagura"),
    UTAKATA(143, "Utakata"),
    SHIBI(147, "Shibi Aburame"),
    RIKUDOU(151, "Rikudou Sennin"),
    OMOI(155, "Omoi"),
    PEIN_CHIKUSHODO1(160, "Pein Chikushodo"),
    PEIN_GAKIDO(161, "Pein Gakido"),
    PEIN_JIGOKUDO(164, "Pein Jigokudo"),
    PEIN_CHIKUSHODO2(166, "Pein Chikushodo"),
    MIZUKI(167, "Mizuki Touji"),
    PEIN_NINGENDO(168, "Pein Ningendo"),
    PEIN_SHURADO(171, "Pein Shurado"),
    DARUI(173, "Darui"),
    DAN(176, "Dan Katou"),
    NAWAKI(185, "Nawaki Senju"),
    MOEGI(184, "Moegi"),
    UDON(188, "Udon"),
    FUU(203, "Fuu"),
    MANGETSU(209, "Mangetsu Hoozuki"),
    ENSUI(211, "Ensui Nara"),
    IZUNA(212, "Izuna Uchiha"),
    MENMA(221, "Menma Uzumaki"),
    YUKIMARU(230, "Yukimaru"),
    MIKOTO(231, "Mikoto Uchiha"),
    BORUTO(235, "Boruto Uzumaki"),
    SARADA(236, "Sarada Uchiha"),
    MITSUKI(237, "Mitsuki"),
    KAGUYA(238, "Kaguya Ootsutsuki"),
    INOJIN(245, "Inojin Yamanaka"),
    SHIKADI(246, "Shikadai Nara"),
    CHOUCHOU(247, "Chouchou Akimichi"),
    METAL(248, "Metal Lee"),
    HIMAWARI(249, "Himawari Uzumaki"),
    ASHURA(259, "Ashura Ootsutsuki"),
    INDRA(260, "Indra Ootsutsuki"),
    IWABEE(261, "Iwabee Yuino"),
    SUMIRE(265, "Sumire");

    private final int id;
    private final String name;

    Ninja(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}