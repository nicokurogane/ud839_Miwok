package com.example.android.miwok.adapters;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.models.Word;

import java.util.ArrayList;


/**
 * Created by Nicolas on 03/03/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /* creamos el constructor por defecto para esta clase
    necesita un contexto para poder inflar el xml del listview, posicion inicial dentro del array
    de la data necesaria
    */

    private  int backgroundColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColor) {
        super(context, 0, words);
        this.backgroundColor = backgroundColor;
    }


    /*
    * Proporciona una vista para el adapterView (GridView, ListView, etc.)
    * @param  position     La posicion en la lista de datos que se debe mostrar en el list item view
    * @param  convertView  la vista reciclada a poblar(llenar).
    * @param  parent       el viewGroup padre que es usado para la inlfacion
    * @return              La vista en la posicion indicada para el AdapterView
    * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //revisamos si la vista existente esta siendo reusada, si no inflamos la vista
        View listItemView = convertView;

        if (listItemView == null) {
            //llamamos el layout personalizado para inflar la vista con el diseno deseado
       //     listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_custom_1, parent, false);
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_2, parent, false);
        }

        //obtenemos el objeto localizado en esta posicion dentro de la lista.
        Word currentWord = getItem(position);

        //busca el textview dentro de list_item_custom_1.xml que tiene el ID para la palabra en miwok
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textview_miwok_word);

        // al textview recien sacado, le asignamos la palabra del objeto localizado
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //hacemos lo mismo para la traduccion del ingles
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.textview_english_word);
        englishTextView.setText(currentWord.getDefaultTranslation());



        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_word);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView

        if( !currentWord.hasImage())
            iconView.setVisibility(View.GONE);
        else
            iconView.setImageResource(currentWord.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int  color = ContextCompat.getColor(getContext(),backgroundColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
