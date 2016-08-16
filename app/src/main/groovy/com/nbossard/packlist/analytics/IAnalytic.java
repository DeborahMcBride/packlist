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

package com.nbossard.packlist.analytics;

import java.util.Map;

/**
 * Interface to be implemented by all analytics, to allow easy change.
 *
 * @author Created by naub7473 on 16/08/16.
 */
public interface IAnalytic
{
    void sendScreenDisplayedReportToTracker(String tag);

    void sendScreenPausedReportToTracker(String tag);

    void sendScreenResumedReportToTracker(String tag);

    void sendEvent(AnalyticsEventList parEvent);
}
