/*
 * PackList is an open-source packing-list for Android
 *
 * Copyright (c) 2016 Nicolas Bossard and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.nbossard.packlist.gui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nbossard.packlist.PackListApp;
import com.nbossard.packlist.R;
import com.nbossard.packlist.analytics.IAnalytic;

import hugo.weaving.DebugLog;

/*
@startuml
    class com.nbossard.packlist.gui.HelpThirdPartyActivity {
    }
@enduml
 */

/**
 * Activity displaying third party libraries and their licences.
 *
 * Accessed from About page.
 * 
 * @author Nicolas BOSSARD (naub7473)
 * 
 */
public class HelpThirdPartyActivity extends AppCompatActivity
{

    // ********************** CONSTANTS *********************************************************************

    /** Log tag. */
    private static final String TAG = HelpThirdPartyActivity.class.getName();

    // ********************** INJECTED FIELDS **************************************************************

    // ********************** FIELDS ************************************************************************

    /** Tracker. */
    private IAnalytic mAnalytic;

    // ********************** METHODS ***********************************************************************

    @DebugLog
    @Override
    protected final void onCreate(final Bundle savedInstState)
    {
        super.onCreate(savedInstState);

        mAnalytic = ((PackListApp) getApplication()).getTracker();
        mAnalytic.sendScreenDisplayedReportToTracker(TAG);

        setContentView(R.layout.activity_help_thirdparty);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mAnalytic.sendScreenPausedReportToTracker(TAG);
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        mAnalytic.sendScreenResumedReportToTracker(TAG);
    }

    // *********************** PRIVATE METHODS **************************************************************

}
