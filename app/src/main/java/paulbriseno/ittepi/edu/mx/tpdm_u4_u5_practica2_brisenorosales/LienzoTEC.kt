package paulbriseno.ittepi.edu.mx.tpdm_u4_u5_practica2_brisenorosales



import android.app.AlertDialog
import android.graphics.BitmapFactory
import android.view.View
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.widget.Toast


class LienzoTEC(nav:MainActivity) :View(nav){ //SURFECE VIEW  / VIEW

        var puntero = nav

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        val w=Paint()

        // APLICACIoNES MULTIMEDIA

        p.color = Color.GREEN
        p.textSize=35f
        //.textSize y otras como Strokes lineas y demas
        c.drawText("Briseno Rosales ",20f,100f,p)
        p.color = Color.BLACK
        c.drawText("Instituto Tecnologico de Tepic ",550f,40f,p)
        p.color = Color.GREEN


        c.drawArc(50f,1300f,500f,1500f,0f,90f,true,p)
        c.drawRect(250f,1400f,350f,1495f,p)                   //Baston
        p.color = Color.BLUE

        c.drawRect(520f,1500f,560f,1700f,p)                  //Entrada Insurgentes Caminoes
        c.drawRect(1000f,1500f,1050f,1700f,p)                  //Entrada Automoviles
        p.color = Color.GREEN

        c.drawRect(50f,1300f,200f,1400f,p)                  //UVP
        c.drawRect(260f,1300f,380f,1350f,p)                 //Laboratorio de computo

        c.drawRect(50f,1170f,200f,1250f,p)                  //Edificio frente al
        p.color = Color.BLUE
        c.drawRect(0f,1000f,50f,1050f,p)                  //Entrada 2 de Agosto
        p.color = Color.GREEN

        c.drawRect(50f,800f,200f,900f,p)                  //LICBI Mecatronica
        c.drawRect(260f,1200f,380f,1250f,p)                 //NUEVA CAFETERIA

        c.drawRect(260f,1050f,380f,1150f,p)             //Laboratorio civil y Electrica
        c.drawRect(260f,620f,420f,700f,p)                //Bodegas de cosas (madera) /Edificio B'
        c.drawRect(430f,650f,535f,710f,p)               // Edificio B

        c.drawRect(430f,1110f,520f,1150f,p)             // bodega-Comite Estudiantil
        c.drawRect(430f,1050f,545f,1090f,p)             //Cafeteria - Salon

        c.drawRect(430f,920f,520f,1000f,p)             // Los J- Copias
        c.drawRect(430f,840f,520f,880f,p)               // Arquitectura salun de sillas para dibujar

        c.drawCircle(540f, 830f ,20f,p)                     //KIOSKO
        c.drawRect(460f,740f,560f,790f,p)           //Auidiovisual - Auditorio

        c.drawRect(600f,1280f,750f,1350f,p)            //UD
        c.drawCircle(600f,1380f,20f,p)                      //Fuente
        c.drawRect(600f,1070f,730f,1135f,p)         //Administrativos

        c.drawRect(535f,900f,680f,970f,p)         //Banos , aulas de gestion y quimica
        c.drawRect(585f,830f,715f,870f,p)           //laboratorios de quimica kisko , Banos G

        c.drawRect(585f,700f,680f,745f,p)           //vinculacion deportiva-creditos /Oficinas del departamento de extraescolares
        c.drawRect(600f,400f,640f,550f,p)           //Bodega de Deportivos

        c.drawRect(300f,50f,600f,200f,p)               //DOMO
        p.color = Color.BLUE
        c.drawRect(0f,0f,60f,50f,p)            //Entrada Parque Ecologico
        p.color = Color.GREEN

        c.drawRect(745f,975f,860f,1085f,p)          //BIBLIOTECA
        c.drawRect(890f,975f,1015f,1020f,p) ; c.drawRect(890f,1050f,1015f,1100f,p)
        c.drawRect(940f,975f,1015f,1055f,p)             // Edificio de Arquitectura

        c.drawRect(745f,880f,820f,930f,p)          //Edificio X
        c.drawRect(840f,880f,950f,930f,p)          //Edificio N

        c.drawRect(745f,815f,850f,850f,p)           //Edificios A
        c.drawRect(855f,815f,890f,850f,p)           //Edificios A'

        c.drawRect(710f,715f,820f,760f,p)           //Edificio G
        c.drawRect(840f,715f,900f,760f,p)           //Edificio G'

        c.drawRect(710f,640f,820f,680f,p)           //Edificio Q



        var laX: MotionEvent?=null
/*
        if(laX?.getY()!! >=0  && laX?.getX() <= 500)
        {
            p.color = Color.RED
            //Canvas().drawArc(50f,1300f,500f,1500f,0f,90f,true,Paint())
            //Canvas().drawRect(250f,1400f,350f,1495f,Paint())                   //Baston

        }*/

    }



        override fun onTouchEvent(e: MotionEvent): Boolean {
            var buscar = ""
            when(e.action){

                MotionEvent.ACTION_DOWN -> {
                    if((e.getX()>=250 && e.getX()<=500)&&(e.getY()>=1400 && e.getY()<= 1495))
                    {
                        Paint().color = Color.RED
                        Canvas().drawArc(50f,1300f,500f,1500f,0f,90f,true,Paint())
                        Canvas().drawRect(250f,1400f,350f,1495f, Paint())                   //Baston

                    }

                    if((e.getX()>=250 && e.getX()<=500)&&(e.getY()>=1400 && e.getY()<= 1495))
                    {
                        Toast.makeText(puntero,"Edificio Baston , se imparten materias de Ciencias Basicas ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=520 && e.getX()<=560)&&(e.getY()>=1500 && e.getY() <=  1700))
                    {
                        Toast.makeText(puntero,"Entrada Al Tecnologico por AV. Insurgentes, Acceso Peatonal", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=1000 && e.getX()<=1050)&&(e.getY()>=1500 && e.getY() <=  1700))
                    {
                        Toast.makeText(puntero,"Entrada Al Tecnologico por AV. Insurgentes, Acceso Automovilistico", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=50 && e.getX()<=200)&&(e.getY()>=1300 && e.getY() <=  1400))
                    {
                        Toast.makeText(puntero,"Unidad de Vinculacion y Posgrado -UVP-, en esta area se encuentra el centro de idiomas , ademas de la oficina de vinculacion del Servicio Social y Residencias ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=260 && e.getX()<=380)&&(e.getY()>=1300 && e.getY() <=  1350))
                    {
                        Toast.makeText(puntero,"Laboratorio de Computo, Se encuentran las aulas equipadas con equipo computacional para ser utulizada por alumnos o maestros", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=50 && e.getX()<=200)&&(e.getY()>=1170 && e.getY() <=  1250))
                    {
                        Toast.makeText(puntero,"Laboratorio Integral de Investigacion en Alimentos, cuenta con las herramientas necesarias para hacer las pruebas necesarias ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=0 && e.getX()<=50)&&(e.getY()>=1000 && e.getY() <=  1050))
                    {
                        Toast.makeText(puntero,"Entrada Al Tecnologico por la Colonia 2 de Agosto , Acceso Peatonal y automovilistico", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=50 && e.getX()<=200)&&(e.getY()>=800 && e.getY() <=  900))
                    {
                        Toast.makeText(puntero,"Laboratorio Integral de Ciencias Basicas e Ingenieria", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=260 && e.getX()<=380)&&(e.getY()>=1200 && e.getY() <=  1250))
                    {
                        Toast.makeText(puntero,"Cafeteria , Edificio en construccion ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=260 && e.getX()<=380)&&(e.getY()>=1050 && e.getY() <=  1150))
                    {
                        Toast.makeText(puntero,"Laboratorio de ingenieria Civil y Electrica ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=260 && e.getX()<=420)&&(e.getY()>=620 && e.getY() <=  700))
                    {
                        Toast.makeText(puntero,"Edificio B', Se utiliza para practicas fisicas de materiales", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=430 && e.getX()<=535)&&(e.getY()>=650 && e.getY() <=  710))
                    {
                        Toast.makeText(puntero,"Edificio B, Se utiliza para diversos propositos ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=430 && e.getX()<=520)&&(e.getY()>=1110 && e.getY() <=  1150))
                    {
                        Toast.makeText(puntero,"Edificio S, Utilizado por el comite estudiantil", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=430 && e.getX()<=545)&&(e.getY()>=1050 && e.getY() <=  1090))
                    {
                        Toast.makeText(puntero,"Edificio K, Se encuentra una cafeteria en este sitio ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=430 && e.getX()<=520)&&(e.getY()>=920 && e.getY() <=  1000))
                    {
                        Toast.makeText(puntero,"Edificio J, En la planta alta se encuentra un centro de copiado ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=430 && e.getX()<=520)&&(e.getY()>=840 && e.getY() <=  880))
                    {
                        Toast.makeText(puntero,"Edificio H, Aula adaptada con muebles para la carrera de Arquitectura", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=530 && e.getX()<=550)&&(e.getY()>=820 && e.getY() <=  840))
                    {
                        Toast.makeText(puntero,"El Kiosko, Tienda de snacks y bebidas ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=430 && e.getX()<=520)&&(e.getY()>=840 && e.getY() <=  880))
                    {
                        Toast.makeText(puntero,"Edificio P, Se encuentra un Audivisual para conferencias y reuniones", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=600 && e.getX()<=750)&&(e.getY()>=1280 && e.getY() <=  1350))
                    {
                        Toast.makeText(puntero,"Unidad Departamental -UD-, Se encuentra un Audivisual para conferencias y reuniones", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=590 && e.getX()<=610)&&(e.getY()>=1370 && e.getY() <=  1390))
                    {
                        Toast.makeText(puntero,"Fuente, Decoracion ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=600 && e.getX()<=730)&&(e.getY()>=1070 && e.getY() <=  1135))
                    {
                        Toast.makeText(puntero,"Edificio Administrativo, Area de financieros y area de Jefes de Departamentos", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=535 && e.getX()<=680)&&(e.getY()>=900 && e.getY() <=  970))
                    {
                        Toast.makeText(puntero,"Edificio L, Aulas para Quimicos y de Gestion ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=585 && e.getX()<=715)&&(e.getY()>=830 && e.getY() <=  870))
                    {
                        Toast.makeText(puntero,"Edificio M, Areas y labotatorios para quimica ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=585 && e.getX()<=700)&&(e.getY()>=700 && e.getY() <=  745))
                    {
                        Toast.makeText(puntero,"Oficinas del departamento de extraescolares , los alumnos liberan sus creditos extracurriculares", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=600 && e.getX()<=640)&&(e.getY()>=400 && e.getY() <=  550))
                    {
                        Toast.makeText(puntero,"Baños Gernerales, Una seccion se utiliza como bodega para material deportivo ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=300 && e.getX()<=600)&&(e.getY()>=50 && e.getY() <=  200))
                    {
                        Toast.makeText(puntero,"Cancha de usos Multiples -DOMO-, En ocaciones se realizan eventos en este lugar ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=0 && e.getX()<=60)&&(e.getY()>=0 && e.getY() <=  50))
                    {
                        Toast.makeText(puntero,"Entrada de Acceso Peatonal y Vehicular -Col. LAGOS-", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=745 && e.getX()<=860)&&(e.getY()>=975 && e.getY() <=  1085))
                    {
                        Toast.makeText(puntero,"Centro de Informacion -Biblioteca- Area de estudio para los estudiantes del Instituto Tecnologico de Tepic ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=890 && e.getX()<=1015)&&(e.getY()>=975 && e.getY() <=  1100))
                    {
                        Toast.makeText(puntero,"Edificio Q, Aulas de Arquitectura", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=745 && e.getX()<=820)&&(e.getY()>=880 && e.getY() <=  930))
                    {
                        Toast.makeText(puntero,"Edificio X, Aulas para Uso de todas las carreras", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=840 && e.getX()<=950)&&(e.getY()>=880 && e.getY() <=  930))
                    {
                        Toast.makeText(puntero,"Edificio N, Aulas para la utilizacion de cualquier carrera", Toast.LENGTH_SHORT)
                            .show()
                    }


                    if((e.getX()>=745 && e.getX()<=850)&&(e.getY()>=815 && e.getY() <=  850))
                    {
                        Toast.makeText(puntero,"Edificio A, Aulas con pantallas utilizado por Gestion Empresarial ", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=855 && e.getX()<=890)&&(e.getY()>=815 && e.getY() <=  850))
                    {
                        Toast.makeText(puntero,"Edificio A', Aulas principalmente utilizadas por Gestion Empresarial", Toast.LENGTH_SHORT)
                            .show()
                    }


                    if((e.getX()>=710 && e.getX()<=820)&&(e.getY()>=715 && e.getY() <=  760))
                    {
                        Toast.makeText(puntero,"Edificio G, Aulas equipadas con pantallas para uso de cualquier carrera", Toast.LENGTH_SHORT)
                            .show()
                    }

                    if((e.getX()>=840 && e.getX()<=900)&&(e.getY()>=715 && e.getY() <=  760))
                    {
                        Toast.makeText(puntero,"Laboratorio de Ingenieria Quimica, ", Toast.LENGTH_SHORT)
                            .show()
                    }


                    if((e.getX()>=710 && e.getX()<=820)&&(e.getY()>=640 && e.getY() <=  680))
                    {
                        Toast.makeText(puntero,"Edificio Q, Aulas para la carrera de Quimica", Toast.LENGTH_SHORT)
                            .show()
                    }



                }
                MotionEvent.ACTION_MOVE -> {

                }
                MotionEvent.ACTION_UP -> {

                }

            }
            return true
        }//TOUCH



}


