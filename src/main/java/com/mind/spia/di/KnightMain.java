package com.mind.spia.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by marius.antal on 6/8/2017.
 */
public class KnightMain
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "META-INF/spring/knight.xml" );
        Knight knight = context.getBean( Knight.class );
        knight.embarkOnQuest( );
        context.close( );
    }
}
