package info.devexchanges.chipedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tokenautocomplete.TokenCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TokenCompleteTextView.TokenListener<ContactView> {

    private ArrayList<ContactView> contacts;
    private FilterAdapter filterAdapter;
    private ContactsCompletionView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setSampleContact();

        autoCompleteTextView = (ContactsCompletionView)findViewById(R.id.autocomplete_textview);

        filterAdapter = new FilterAdapter(this, R.layout.item_contact, contacts);
        autoCompleteTextView.setAdapter(filterAdapter);
        autoCompleteTextView.setTokenListener(this);
        autoCompleteTextView.setTokenClickStyle(TokenCompleteTextView.TokenClickStyle.Select);
    }

    private void setSampleContact() {
        contacts = new ArrayList<>();
        contacts.add(new ContactView(R.drawable.female, "Thanh Ngan", "ngan@gmail.com"));
        contacts.add(new ContactView(R.drawable.male, "Quang Minh", "minh@gmail.com"));
        contacts.add(new ContactView(R.drawable.male, "Tran Tinh", "thanh_67@gmail.com"));
        contacts.add(new ContactView(R.drawable.female, "Phan Hoa", "hoa@gmail.com"));
        contacts.add(new ContactView(R.drawable.female, "Pham Trang", "trang@gmail.com"));
        contacts.add(new ContactView(R.drawable.male, "Dinh Tuan", "dtuan@gmail.com"));
        contacts.add(new ContactView(R.drawable.female, "Kim Chi", "kimchi@gmail.com"));
        contacts.add(new ContactView(R.drawable.male, "Quoc Cuong", "cuong@gmail.com"));
        contacts.add(new ContactView(R.drawable.female, "Hai Yen", "hai_yen@gmail.com"));
    }

    @Override
    public void onTokenAdded(ContactView token) {

    }

    @Override
    public void onTokenRemoved(ContactView token) {

    }
}
