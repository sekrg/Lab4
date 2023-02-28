package people;
import enums.MagicObjects;
import buildings.*;
import exceptions.*;
import interfaces.*;

public class HarryPotter extends Person implements Feel, Talk, Found, Extract, Rotate, Saw, Stand, Bent, Breathe, Come, Open, Pull, Scarred, Shove, Want, Fly {

    public HarryPotter() {
        super("Гарри Поттер");
    }

    @Override
    public void feel() {
        Hogwarts.office x = new Hogwarts.office("Кабинет Дамблдора");
        System.out.println("В " + x.getName() + " " + getName() + " чувствовал себя гораздо спокойнее");
    }

    @Override
    public void talk(int x) throws Throwable {
        Throwable ex = new TimeException("Прошло слишком много времени и директор не пришел :( ");
        System.out.println("Еще "+x+" минут, и " + getName() + " расскажет директору о своем сне.");
        if (x>= 30) throw ex;
    }

    @Override
    public void lookup() {
        System.out.println("" + getName() + " вскинул глаза на стену позади стола");
    }

    @Override
    public void found(MagicObjects x) {
        System.out.println("Рядом с ней в стеклянном футляре покоился украшенный рубинами серебряный меч." + getName() + " сразу узнал его — " + x.toString() + ", основателя их факультета.");
    }

    @Override
    public void extract(MagicObjects x, MagicObjects y) {
        System.out.println("Это " +y.toString() + " " + getName() + " извлек тогда в подземелье из " + x.toString() + ". ");
    }

    @Override
    public void rotate() {
        System.out.println("" + getName() + " обернулся назад — черный шкафчик на подставке неплотно закрыт, из щелки падает яркая мерцающая полоска света");
    }

    @Override
    public void saw(MagicObjects x) {
        if (x.equals(MagicObjects.PHOENIX)) {
            System.out.println("" + getName() + " бросил взгляд на Фоукса");
        } else if (x.equals(MagicObjects.HAT)) {
            System.out.println("и увидел на полке старую, залатанную " + x.toString() + ".");

        }

    }

    @Override
    public void stand() {
        System.out.println("Встал из-за стола.");
    }

    @Override
    public void come() {
        System.out.println("Подошел к шкафчику");
    }

    @Override
    public void open(MagicObjects x) {
        System.out.println("Решительно потянул на себя дверцу. Внутри стоял неглубокий каменный " + x.toString() + ", опоясанный по краю резными письменами и символами.");
    }

    @Override
    public void notsaw() {
        System.out.println("Ничего подобного Гарри никогда не видел, даже не мог понять, жидкость это или газ.");
    }

    @Override
    public void want() {
        System.out.println("" + getName() + " очень захотел провести по нему ладонью, ощутить пальцами, но почти четыре года в Школе чародейства и волшебства подсказали: окунать руку в сосуд непонятно с чем было бы верхом глупости.");
    }

    @Override
    public void pull(MagicObjects x) {
        System.out.println("" + getName() + " вытащил " + x.toString() + ", настороженно огляделся и легонько ткнул содержимое палочкой");
    }

    @Override
    public void shove() {
        System.out.println("Сунув голову в шкафчик," + getName() + " заглянул в сосуд");
    }

    @Override
    public void saw() {
        Hogwarts.hall x = new Hogwarts.hall("Зал");
        System.out.println(" Дна не было — где-то глубоко открывался " + x.getName() + ", как будто " + getName() + " смотрит в круглое окно, находящееся у нее в потолке.");
    }

    @Override
    public void bent() {
        System.out.println("" + getName() + " склонился так низко, что почти коснулся носом подобия стекла.");
    }

    @Override
    public void scarred() {
        if(Math.random()<=0.000000005) throw new HeartStopException("Сердце у " + getName() + " сжалось от увиденного. Гарри Поттер умер от остановки сердца");
        System.out.println("Сердце у " + getName() + " сжалось: неужели всякого, кто сядет в кресло, прикуют к нему? ");
    }

    @Override
    public void notsaw(MagicObjects x) {
        Hogwarts.hall y = new Hogwarts.hall("Зал");
        System.out.println("" + x.toString() + " был круглый, а " + y.getName() + " квадратный, и " + getName() + " не видел, что делается по углам.");
    }

    @Override
    public void bend() {
        System.out.println("Наклонился еще ниже, завертел головой... И кончик носа коснулся прозрачной поверхности... ");
    }

    @Override
    public void fly(MagicObjects z) {
        Hogwarts.office x = new Hogwarts.office("Кабинет Дамблдора");
        System.out.println("" + x.getName() + " вдруг покачнулся, Гарри полетел головой вперед внутрь " + z.toString() + ": никакого стекла не оказалось, и Гарри всосал в себя черный ледяной водоворот... ");
    }

    @Override
    public void lookupp() {
        System.out.println("" + getName() + " поднял взгляд — никакого отверстия, высоко над ним сплошной каменный потолок");
    }

    @Override
    public void breathe() {
        System.out.println("Тяжело дыша, " + getName() + " огляделся.");
    }

    @Override
    public void rotated() {
        System.out.println("" + getName() + " повернулся к сидящему рядом волшебнику, и из груди у него вырвался изумленный возглас, разнесшийся эхом по всему залу.");
    }

    @Override
    public void sit() {
        System.out.println("И вот " + getName() + " уже сидит на верхней скамье в том самом зале, который только что разглядывал сверху.");

    }



}
