package LeetCode;

/**
 * @author hyy
 * @date 2019/11/14 20:00
 */

//时间复杂度有点大，但是能够通过
public class Leetcode84 {
    public int largestRectangleArea(int[] heights) {

        long maxArea = 0;
        //首先尝试遍历
        int n = heights.length;
        for (int i = 0; i < n; i++) {
            long height = heights[i];
            //向左边遍历
            long minHeight = height;
            long width = 2;
            maxArea = Math.max(maxArea,height);
            for (int j = i-1; j >=0 ; j--) {
                //取最小高度
                minHeight = Math.min(minHeight,heights[j]);
                //System.out.println(minHeight);
                //剪枝
                if (minHeight * (i+1) <maxArea){
                    break;
                }
                long area = minHeight * width++;
                maxArea = Math.max(maxArea,area);
            }
        }
        return (int) maxArea;
    }

    public static void main(String[] args) {
        Leetcode84 leetcode84 = new Leetcode84();
        int[] a = new int[]{9046155,17522430,44186957,40374643,77652689,89027934,97586333,68834337,62979669,1783127,29339118,83907628,48067922,22843915,11027247,73603247,32376863,12448072,7086475,2369889,5064817,88893600,61558880,77108330,32113014,21324782,28294417,18403046,39022240,58687324,80978280,584748,76209754,25165237,40959391,6378795,66709524,38545724,75213133,29689193,92845203,4552251,13596821,40913125,27396166,24624068,67032725,12289382,89588493,74119200,14659271,94653310,15529152,28734503,24277993,47642166,50059286,52572410,18561565,89081526,11259734,99539845,42182626,39985840,24705083,83142017,46364635,43930959,74204093,74094120,73620152,67049296,31162724,87216973,7962422,58558890,64357394,27511499,23364624,53945887,1630699,38023896,1115549,69676203,66758399,25393542,17318370,16817685,30482304,88396287,58415564,94258390,87936132,598190,34244230,65157567,36256560,80608866,9088526,10460653,7219338,82708678,77509950,38382062,22442004,37988724,49457305,39315750,65500223,72821929,93261637,19647274,63362177,46893538,89323477,30120577,24803433,59158199,99454614,55285737,47554486,10386530,2060480,88006971,63501073,36304710,53164538,99757633,69429928,14769417,62734638,76649267,49994447,40244588,15031329,24952803,30749664,64488634,64268553,48766239,89826916,10046542,68413513,53189093,56940081,10253343,83309670,81743514,69411542,35280637,89545603,69482381,98183519,91606083,57489352,61684592,27910794,63170242,13958577,49857074,30456011,76693216,26506341,80450459,69454156,94054023,5403262,52720173,11059009,22188168,1486412,885925,32234710,22416278,54075019,89174791,32669621,89901041,23434657,54597515,77698030,65496613,24079896,75881550,57102696,34085600,90082494,37529842,97255843,4041072,87386917,27711854,33250640,66409610,60678665,2704796,60463633,18598280,7941321,24038995,40786448,9427734,24924920,73021158,31844012,31516291,14712302,17029985,21417333,38146959,71627500,99115363,56159924,48223749,27513265,13262621,82309349,17595760,50792463,32081544,74153184,90695732,12309751,7403824,57105343,72988416,62624972,70085328,91586696,70566294,94124323,32373144,32510380,71565596,57910655,16870744,3081887,72622957,33900729,24499220,63286268,5528229,76130936,19446193,6268330,56160553,85225166,88577680,73756313,36017629,20659224,425849,79229714,32968975,60346025,88851409,58473744,22970998,58936737,50060440,46053644,5577413,34949937,31080376,77143009,92860592,47951120,80224896,65483549,81851849,57240469,81286169,39896430,85887757,732362,46164761,42048310,38473880,87258793,68320976,74491510,7918017,68746825,6237576,93403345,29092851,95088985,51877089,4580201,6542074,54453881,3150197,12119487,89403818,34230573,89262496,82264410,34698045,22003745,264311,16549894,31760566,81550481,8962676,70164675,34799195,7643789,64729337,73273076,94902582,85566665,280938,2820600,6829843,59034866,48740297,88439046,54123851,617386,45535599,60665925,7587619,48685796,72785413,96991438,35432721,14564261,31772200,70130766,89084358,32036512,39197012,73361276,66103345,48159688,96042303,53418892,55803478,13287993,26691968,3222412,98854658,79489258,6043012,5684501,38524124,7299661,94123547,45164327,60433399,39659146,5830253,68021019,40861294,31132018,65012457,76294015,98212631,96784657,98941133,39813342,81337521,38138145,65690970,47440866,38814186,61733274,53376111,47134016,75021267,32584431,50356428,26392277,12073690,8915793,32076779,3114166,16215454,78716678,794846,76648854,70892177,6625099,44669873,64269823,90273469,62198682,93080191,41002452,11499691,92021324,80815794,92837213,82675822,46506765,92794431,21490008,60756391,46170542,68624024,88294010,78754974,18980452,14686287,43345016,80412597,99279418,98975534,96628052,77996097,99770380,73276906,1404626,58911831,70463131,65674449,49185300,32661813,58754640,42704105,44161504,3292317,23519899,89515069,85968139,22543016,82309501,7458147,35815759,80996395,28598523,24109769,12267721,95327,91312409,8129089,80507925,90591827,7104624,77135977,21104276,59391356,2929235,22508902,18303188,73392366,40699704,20004840,6054179,51970696,62708945,2732035,55263013,38745197,92247105,93747504,13804565,27072958,53722003,2136677,8069353,82320526,26246446,72853427,82415854,70075207,80982516,15440131,60667035,40603492,45092460,81771311,99994849,48021695,56796566,70814389,21414061,50012622,43335581,79984592,1983318,6044527,35232979,9762684,97306076,27480084,3510188,63626993,7069394,57232192,65763670,15138748,92069070,44526469,40508527,27001276,14601676,21491043,42441407,75268711,14610888,40050219,9556375,67122089,88071914,66352941,37936478,62002327,16365563,81272059,94503271,70865233,39832938,29736251,33144269,37139014,9732687,89170810,53282360,16802082,46403002,19046030,84457182,90988424,63572499,24965709,17989701,30690528,98973104,12947460,5959239,13583992,52997680,68031966,80706081,93585946,34384907,71158911,8104626,3266822,52430971,2607897,26648408,44780261,32344148,59792677,34435628,42076836,48963487,87717988,11395270,47882841,59280370,95852452,91387618,75369222,20818161,61893671,6059750,19791265,74841131,64535341,85891610,80355163,32567308,19114043,26457462,19468567,42789307,34562088,75251742,95220278,37169985,1900150,92516891,22030486,14209179,26952519,16623674,15689019,67186859,28018944,63571860,26467230,23871396,54959478,1836452,97205909,16853149,60412554,69513526,44210633,24947895,55405136,77082148,10031555,27035532,56055962,82016475,69824839,90618050,57268217,17561469,80304388,11684719,10078360,2334874,78410250,89547232,71474900,94099269,56734091,99493844,10187482,35717673,23365240,65146960,37554125,73087501,34516462,50483031,42601027,31243447,27947279,50522516,60841947,37978834,77558048,16897910,19995309,47382887,60032312,29779878,17460708,40336700,93980949,80055420,95187926,72391200,69602652,66662826,19006821,78853096,66156670,29194303,14570769,42038262,46857616,4641247,15125763,33890430,55124278,57726791,65133877,83071557,8249307,78492176,73566744,38323707,95390086,46078405,38222946,55422399,75858284,55683654,95759099,22355585,35739074,43463378,47263137,57858079,10126204,66269959,89227527,76282875,47980614,3798296,70837489,94838230,60955895,85963253,28728660,68596526,96206396,46378889,4184435,56972055,24871066,77751179,95295762,20261152,76345937,33518708,28199903,4720573,89202362,76475355,27076158,77457788,19938733,26855648,87832219,30064937,93125607,77059746,58864164,41106221,33374395,82218006,88460804,94330290,68181259,69705816,15443168,16904007,16084706,19627604,73876062,93472124,49895135,69171824,66249628,26241072,2690532,94449532,83477997,44409246,23441239,10554156,74383386,43379972,37409804,14731958,25961261,83051763,91791704,37341778,76674336,77682451,19559784,65135140,72012742,40257395,34840957,39972262,57161402,3442015,12116218,31037464,96914139,62011354,52725640,63163767,40768778,55416172,10129651,24246776,52341770,33570890,87317284,26725156,29467214,77243440,41457114,55428476,60295203,85765171,45286606,36969539,63447622,64846390,54621032,87976716,57620137,41978341,27948979,14781539,45420356,40065197,98335355,94850847,54592903,51060995,58014614,47878034,58993519,20660618,72124810,11335289,54231508,11958446,90576797,83698723,89201886,84550264,91643551,2013441,22831787,36930157,38982980,86279409,54292899,46120364,26772478,11913036,40615057,7237809,79210927,38551765,99819358,77546282,33402612,54412262,81123629,43933579,2290296,40117148,64594197,26931458,3968789,18825705,38889904,94545586,55040780,80608142,31612202,46684331,82621583,54443989,83614488,74120915,40723399,90423739,20241280,20012229,2336775,60856337,27250038,34064054,99408103,27069396,11610336,85327067,33998010,45250317,29260646,88804658,85367465,46371195,15736116,89336254,17713253,7142372,36398193,72754033,87750514,68010395,19438365,70372097,22454385,3052853,44493013,15694136,93476593,17250645,35706365,48329720,30623334,15472755,82393775,82547789,95058503,46520463,20391209,29056514,91770781,2168207,70377524,29654598,48539403,38629993,71507205,66252656,45772365,7905398,39006689,86039232,75915793,58445054,8927681,98370178,14014260,5937046,66580666,60007205,75704043,2287031,60853277,6327378,70276138,95763404,41391519,65334642,42283868,61782728,46907508,86571001,63950936,17285032,68741951,12490339,55915025,40249156,31259347,54203743,670906,70266036,92759327,76586700,81227443,1687008,27473230,47758055,7624055,94053897,60281612,35844450,48857280,21134889,42171828,71649771,69414646,36079700,36984413,64214866,97862428,36408273,3302219,61813364,6209657,72044170,26820055,14641035,64809679,58079402,68844778,65480585,80861791,61604105,94583637,14605586,15807465,22056868,62363641,75947872,68627117,75161605,11792323,70000749,96296494,6480503,41650520,18227492,42560203,31151285,82442358,40422632,67559558,85744577,54752348,26285568,10305100,81572404,40926603,75114779,92168158,62287733,40595364,73029949,76408190,35179002,87635535,92215655,9752222,2515528,68163528,78379339,77677133,32472203,48380088,26489980,38952706,90030609,44717472,81512910,73698246,27159831,74451894,41257805,65420760};
        System.out.println(leetcode84.largestRectangleArea(a));
    }
}
