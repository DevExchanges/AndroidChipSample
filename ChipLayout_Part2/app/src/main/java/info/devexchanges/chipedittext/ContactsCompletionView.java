package info.devexchanges.chipedittext;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tokenautocomplete.TokenCompleteTextView;

/**
 * Sample token completion view for basic contact info
 *
 * Created on 9/12/13.
 * @author mgod
 */
public class ContactsCompletionView extends TokenCompleteTextView<ContactView> {

    public ContactsCompletionView(Context context) {
        super(context);
    }

    public ContactsCompletionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ContactsCompletionView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected View getViewForObject(ContactView contact) {
        LayoutInflater l = (LayoutInflater)getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View tokenView = l.inflate(R.layout.item_autocomplete_contact, (ViewGroup) getParent(), false);
        TextView textView = (TextView) tokenView.findViewById(R.id.text);
        ImageView icon = (ImageView) tokenView.findViewById(R.id.icon);
        textView.setText(contact.getName());
        icon.setImageResource(contact.getDrawableId());

        return tokenView;
    }

    @Override
    protected ContactView defaultObject(String completionText) {
        //Stupid simple example of guessing if we have an email or not
        int index = completionText.indexOf('@');
        if (index == -1) {
            return new ContactView(R.drawable.male, completionText, completionText.replace(" ", "") + "@example.com");
        } else {
            return new ContactView(R.drawable.female, completionText.substring(0, index), completionText);
        }
    }
}
