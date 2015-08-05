package com.google.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.ContentResolver;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.GooglePlayServicesUtil;
//import com.google.android.gms.common.SignInButton;

import java.util.ArrayList;
import java.util.List;

/**
 * A login screen that offers login via email/password and via Google+ sign in.
 * <p/>
 * ************ IMPORTANT SETUP NOTES: ************
 * In order for Google+ sign in to work with your app, you must first go to:
 * https://developers.google.com/+/mobile/android/getting-started#step_1_enable_the_google_api
 * and follow the steps in "Step 1" to create an OAuth 2.0 client for your package.
 */
public class LoginActivity extends Activity {

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[] {
            "foo@example.com:hello", "bar@example.com:world"
    };
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mEmailLoginFormView;
//    private SignInButton mPlusSignInButton;
    private View mSignOutButtons;
    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

//        // Find the Google+ sign in button.
//        mPlusSignInButton = ( SignInButton ) findViewById( R.id.plus_sign_in_button );
//        if ( supportsGooglePlayServices() ) {
//            // Set a listener to connect the user when the G+ button is clicked.
//            mPlusSignInButton.setOnClickListener( new OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    signIn();
//                }
//            } );
//        } else {
//            // Don't offer G+ sign in if the app's version is too low to support Google Play
//            // Services.
//            mPlusSignInButton.setVisibility( View.GONE );
//            return;
//        }
//
//        // Set up the login form.
//        mEmailView = ( AutoCompleteTextView ) findViewById( R.id.email );
//        populateAutoComplete();
//
//        mPasswordView = ( EditText ) findViewById( R.id.password );
//        mPasswordView.setOnEditorActionListener( new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
//                if ( id == R.id.login || id == EditorInfo.IME_NULL ) {
//                    attemptLogin();
//                    return true;
//                }
//                return false;
//            }
//        } );
//
//        Button mEmailSignInButton = ( Button ) findViewById( R.id.email_sign_in_button );
//        mEmailSignInButton.setOnClickListener( new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                attemptLogin();
//            }
//        } );
//
//        mLoginFormView = findViewById( R.id.login_form );
//        mProgressView = findViewById( R.id.login_progress );
//        mEmailLoginFormView = findViewById( R.id.email_login_form );
//        mSignOutButtons = findViewById( R.id.plus_sign_out_buttons );
    }


}

