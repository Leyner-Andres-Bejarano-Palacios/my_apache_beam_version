/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.runners.spark.structuredstreaming;

import org.apache.beam.runners.spark.SparkCommonPipelineOptions;
import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;

/**
 * Spark runner {@link PipelineOptions} handles Spark execution-related configurations, such as the
 * master address, and other user-related knobs.
 */
public interface SparkStructuredStreamingPipelineOptions extends SparkCommonPipelineOptions {

  /** Set to true to run the job in test mode. */
  @Default.Boolean(false)
  boolean getTestMode();

  void setTestMode(boolean testMode);

  @Description("Enable if the runner should use the currently active Spark session.")
  @Default.Boolean(false)
  boolean getUseActiveSparkSession();

  void setUseActiveSparkSession(boolean value);
}
